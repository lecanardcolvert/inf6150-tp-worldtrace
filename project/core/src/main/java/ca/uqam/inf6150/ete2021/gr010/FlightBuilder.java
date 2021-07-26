package ca.uqam.inf6150.ete2021.gr010;

import ca.uqam.inf6150.ete2021.gr010.flight.db.model.City;
import ca.uqam.inf6150.ete2021.gr010.flight.db.model.Flight;
import ca.uqam.inf6150.ete2021.gr010.flight.gui.math.Degree;
import ca.uqam.inf6150.ete2021.gr010.flight.gui.math.LibGDXMathUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Vector2;

public class FlightBuilder {

    // plane info
    private final float  m_planeSpeed;
    // Airport info
    private final float  m_airportRadius;
    private       Sprite m_plane;
    private       Circle m_arrivalAirport;
    private       Circle m_departureAirport;

    // info flight
    private Vector2 m_planeDir;

    public FlightBuilder() {
        Texture planeTexture = new Texture("assets/plane.png");
        float   m_planeSize  = 32f;
        m_planeSpeed    = 100f;
        m_airportRadius = 3f;
        m_plane         = new Sprite(planeTexture);
        m_plane.setSize(m_planeSize, m_planeSize);
        m_plane.setOriginCenter();
    }

    public void findAirportCoordinates(Flight flight, Vector2 halfViewport) {
        assert airportExist();

        City beginAirport = flight.getBeginAirport().getCity();
        City endAirport   = flight.getEndAirport().getCity();

        spawnAirports(halfViewport, beginAirport, endAirport);
    }

    private void spawnAirports(final Vector2 halfViewport, final City beginAirport, final City endAirport) {
        m_arrivalAirport   = new Circle();
        m_departureAirport = new Circle();

        m_departureAirport.x = halfViewport.x + (float) ((beginAirport.getLongitude() / Degree.HALF.getDegrees() * halfViewport.x));
        m_departureAirport.y = halfViewport.y + (float) ((beginAirport.getLatitude() / Degree.QUARTER.getDegrees() * halfViewport.y));
        m_arrivalAirport.x   = halfViewport.x + (float) ((endAirport.getLongitude() / Degree.HALF.getDegrees() * halfViewport.x));
        m_arrivalAirport.y   = halfViewport.y + (float) ((endAirport.getLatitude() / Degree.QUARTER.getDegrees() * halfViewport.y));

        m_arrivalAirport.radius   = m_airportRadius;
        m_departureAirport.radius = m_airportRadius;

        Vector2 start = new Vector2(m_departureAirport.x, m_departureAirport.y);
        Vector2 end   = new Vector2(m_arrivalAirport.x, m_arrivalAirport.y);

        m_planeDir = end.sub(start).nor();
    }

    public void setFlightOrientation() {
        m_plane.setCenter(m_departureAirport.x, m_departureAirport.y);
        m_plane.flip(true, m_departureAirport.x < m_arrivalAirport.x);
        m_plane.rotate(findFlightAngle());
    }

    private float findFlightAngle() {
        final Vector2 departurePosition = LibGDXMathUtils.getCirclePosition(m_departureAirport);
        final Vector2 arrivalPosition   = LibGDXMathUtils.getCirclePosition(m_arrivalAirport);

        return arrivalPosition.angleDeg(departurePosition);
    }

    public void destroyFlight() {
        m_plane            = null;
        m_arrivalAirport   = null;
        m_departureAirport = null;
        m_planeDir.setZero();
    }

    public void drawPlane(Batch m_batch) {
        if (m_plane != null) {
            m_plane.draw(m_batch);
        }
    }

    public void drawAirports(ShapeRenderer m_shapeRenderer) {
        if (m_departureAirport != null && m_arrivalAirport != null) {
            m_shapeRenderer.circle(m_departureAirport.x, m_departureAirport.y, m_airportRadius);
            m_shapeRenderer.circle(m_arrivalAirport.x, m_arrivalAirport.y, m_airportRadius);
        }
    }

    public boolean planeExist() {
        final boolean planeExist = m_plane != null;
        assert planeExist == airportExist();

        return planeExist;
    }

    public boolean airportExist() {
        return m_arrivalAirport != null && m_departureAirport != null;
    }

    public boolean planeOverlapsAirport() {
        return Intersector.overlaps(m_arrivalAirport, m_plane.getBoundingRectangle());
    }

    public void planeTranslation() {
        Vector2 translation = new Vector2(m_planeDir).scl(m_planeSpeed).scl(Gdx.graphics.getDeltaTime());
        m_plane.translate(translation.x, translation.y);
    }
}
