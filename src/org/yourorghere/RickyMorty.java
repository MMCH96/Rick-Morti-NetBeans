package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * RickyMorty.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class RickyMorty implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new RickyMorty());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(1f, 1f, 1f, 1f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(100.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        gl.glTranslatef(-3f, -5f, -6.0f);
        
        
        cuerporick(gl);
        batarick(gl);
        cinturon(gl);
        pantalon(gl);
        manorick(gl);
        cabellorick(gl);
        cabezarick(gl);
        cuerpomorty(gl);
        brazorick(gl);
        cararick(gl);
        
        manga1rick(gl);
        manga2rick(gl);
        contornosrick(gl);
        cabellomorty(gl);
        manorick(gl);
        mano2rick(gl);
        brazolargomorty(gl);
        brazocortomorty(gl);
        cabezamorty(gl);
        caramorty(gl);
        
        detalles(gl);
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }
    public void batarick(GL gl)
    {
        gl.glColor3f(1, 1, 1);
        gl.glLineWidth(4);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(2,0);//A
        gl.glVertex2f(2.1172874634104f,1.4438716390631f);//C
        gl.glVertex2f(2.0110485581613f,2.6974907210023f);//D
        gl.glVertex2f(2.0216724486862f,4.1954592850143f);//E
        gl.glVertex2f(0.778677257272f,3.0480791083242f);//F
        gl.glVertex2f(0.5237038846742f,2.9418402030751f);//G
        gl.glVertex2f(0.3430977457508f,3.0268313272744f);//H
        gl.glVertex2f(0.204987168927f,3.2074374661978f);//I
        gl.glVertex2f(0.2262349499768f,3.4411630577458f);//J
        gl.glVertex2f(0.3749694173255f,3.7917514450678f);//K
        gl.glVertex2f(0.7999250383218f,4.6204149060106f);//L
        gl.glVertex2f(1.3417434550921f,5.3534633522293f);//M
        gl.glVertex2f(2.0854157918357f,6.309613499471f);//N
        gl.glVertex2f(2.276645821284f,6.4477240762948f);//O
        gl.glVertex2f(2.967198705403f,6.4477240762948f);//P
        gl.glVertex2f(3.4534409276199f,2.9643186523054f);//R
        gl.glVertex2f(3.1496057793683f,1.006269919128f);//S
        gl.glVertex2f(2.900848155422f,0);//T
        
        gl.glEnd();
        
    }
    public void cinturon(GL gl)
    {
     gl.glColor3f(0.37f, 0.27f, 0.043f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(3.1658025094532f,0.9156320303737f);//U
     gl.glVertex2f(5.0713303330632f,0.9935021577808f);//V
     gl.glVertex2f(5.1537810562002f,0.6499574780434f);//W
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glVertex2f(3.0650294033969f,0.5858291378258f);//A1
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
        gl.glLineWidth(2);
        gl.glBegin(GL.GL_LINE_LOOP);
        gl.glVertex2f(3.1658025094532f,0.9156320303737f);//U
        gl.glVertex2f(5.0713303330632f,0.9935021577808f);//V
        gl.glVertex2f(5.1537810562002f,0.6499574780434f);//W
        gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
        gl.glVertex2f(3.0650294033969f,0.5858291378258f);//A1
        gl.glEnd();
    }
    
    public void pantalon(GL gl)
    {
     gl.glColor3f(0.63f, 0.45f, 0.074f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(3.0650294033969f,0.5858291378258f);//A1
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glVertex2f(5.1537810562002f,0.6499574780434f);//W
     gl.glVertex2f(5.3640899970855f,0);//B1
     gl.glVertex2f(2.900848155422f,0);//T
     gl.glEnd();   
    }
    
    public void manorick(GL gl)
    {
     gl.glColor3f(0.92f, 0.91f, 0.84f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(2.599612321892f,6.032748943532f);//C1
     gl.glVertex2f(2.967198705403f,6.4477240762948f);//P
     gl.glVertex2f(3.2201166002995f,6.5859696254856f);//D1
     gl.glVertex2f(3.549058627407f,6.6233494012933f);//E1
     gl.glVertex2f(3.8780006545146f,6.6158734461318f);//F1
     gl.glVertex2f(4.1247071748453f,6.4887822083857f);//G1
     gl.glVertex2f(4.1546109954914f,6.2719795087011f);//H1
     gl.glVertex2f(4.1546109954914f,6.0626527641781f);//I1
     gl.glVertex2f(4.0574235783915f,5.8832298403013f);//J1
     gl.glVertex2f(3.95276020613f,5.7785664680398f);//K1
     gl.glVertex2f(3.8899327036683f,5.8052143153153f);//L1
     gl.glVertex2f(3.839292922177f,5.8769540057613f);//M1
     gl.glVertex2f(3.7169134502398f,5.8178742606881f);//N1
     gl.glVertex2f(3.6451737597939f,5.7630144974059f);//O1
     gl.glVertex2f(3.5818740329298f,5.7376946066603f);//P1
     gl.glVertex2f(3.4974743971111f,5.7630144974059f);//Q1
     gl.glVertex2f(3.4172947430832f,5.7461345702422f);//R1
     gl.glVertex2f(3.3117951983098f,5.7165946977056f);//S1
     gl.glVertex2f(3.2358355260729f,5.7292546430784f);//T1
     gl.glVertex2f(3.1809757627907f,5.7630144974059f);//U1
     gl.glVertex2f(3.0543763090626f,5.7419145884513f);//V1
     gl.glVertex2f(2.9699766732438f,5.7630144974059f);//W1
     gl.glVertex2f(2.8855770374251f,5.7461345702422f);//Z1
     gl.glVertex2f(2.7716375290697f,5.7841144063606f);//A2
     gl.glVertex2f(2.6914578750419f,5.8389741696428f);//B2
     gl.glVertex2f(2.6239381663869f,5.893833932925f);//C2
     gl.glEnd();
     
        gl.glColor3f(0f, 0f, 0f);
        gl.glLineWidth(2);
        gl.glBegin(GL.GL_LINE_LOOP);
        gl.glVertex2f(2.599612321892f,6.032748943532f);//C1
        gl.glVertex2f(2.967198705403f,6.4477240762948f);//P
        gl.glVertex2f(3.2201166002995f,6.5859696254856f);//D1
        gl.glVertex2f(3.549058627407f,6.6233494012933f);//E1
        gl.glVertex2f(3.8780006545146f,6.6158734461318f);//F1
        gl.glVertex2f(4.1247071748453f,6.4887822083857f);//G1
        gl.glVertex2f(4.1546109954914f,6.2719795087011f);//H1
        gl.glVertex2f(4.1546109954914f,6.0626527641781f);//I1
        gl.glVertex2f(4.0574235783915f,5.8832298403013f);//J1
        gl.glVertex2f(3.95276020613f,5.7785664680398f);//K1
        gl.glVertex2f(3.8899327036683f,5.8052143153153f);//L1
        gl.glVertex2f(3.839292922177f,5.8769540057613f);//M1
        gl.glVertex2f(3.7169134502398f,5.8178742606881f);//N1
        gl.glVertex2f(3.6451737597939f,5.7630144974059f);//O1
        gl.glVertex2f(3.5818740329298f,5.7376946066603f);//P1
        gl.glVertex2f(3.4974743971111f,5.7630144974059f);//Q1
        gl.glVertex2f(3.4172947430832f,5.7461345702422f);//R1
        gl.glVertex2f(3.3117951983098f,5.7165946977056f);//S1
        gl.glVertex2f(3.2358355260729f,5.7292546430784f);//T1
        gl.glVertex2f(3.1809757627907f,5.7630144974059f);//U1
        gl.glVertex2f(3.0543763090626f,5.7419145884513f);//V1
        gl.glVertex2f(2.9699766732438f,5.7630144974059f);//W1
        gl.glVertex2f(2.8855770374251f,5.7461345702422f);//Z1
        gl.glVertex2f(2.7716375290697f,5.7841144063606f);//A2
        gl.glVertex2f(2.6914578750419f,5.8389741696428f);//B2
        gl.glVertex2f(2.6239381663869f,5.893833932925f);//C2
        gl.glEnd();
    }
    
    public void cabezarick (GL gl)
    {
     gl.glColor3f(0.92f, 0.91f, 0.84f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(3.5818740329298f,5.7376946066603f);//P
     gl.glVertex2f(2.6922244534938f,6.6964421836133f);//D2
     gl.glVertex2f(2.5558346101902f,6.8471888525279f);//E2
     gl.glVertex2f(2.4625152437192f,7.1199685391352f);//F2
     gl.glVertex2f(2.3835527028592f,7.3855698129371f);//G2
     gl.glVertex2f(2.3381244176057f,7.5811610968791f);//H2
     gl.glVertex2f(2.3620437113287f,7.687089397652f);//I2
     gl.glVertex2f(2.4474697603391f,7.7075916494145f);//J2
     gl.glVertex2f(2.4440527183787f,7.8647755795937f);//K2
     gl.glVertex2f(2.4543038442599f,8.0937173909416f);//L2
     gl.glVertex2f(2.4918913058245f,8.4456727128645f);//M2
     gl.glVertex2f(2.5567083460436f,8.689381676197f);//N2
     gl.glVertex2f(2.7492961950327f,9.4032849095188f);//O2
     gl.glVertex2f(2.8782139150668f,9.7139412275214f);//P2
     gl.glVertex2f(2.96153798024f,9.9123318588861f);//Q2
     gl.glVertex2f(3.0885079843134f,10.0353340503322f);//R2
     gl.glVertex2f(3.2749951777961f,10.1384971786418f);//S2
     gl.glVertex2f(3.4396860797879f,10.2403111364833f);//T2
     gl.glVertex2f(3.5946276465758f,10.2566207750925f);//U2
     gl.glVertex2f(3.9289752380654f,10.2810852330064f);//V2
     gl.glVertex2f(4.2551680102504f,10.2117692689171f);//W2
     gl.glVertex2f(4.53650927626f,10.1016792083047f);//Z2
     gl.glVertex2f(4.6914508430479f,9.9956665573445f);//A3
     gl.glVertex2f(4.8056183133126f,9.8814990870798f);//B3
     gl.glVertex2f(4.9116309642727f,9.7510219782058f);//C3
     gl.glVertex2f(5.0176436152328f,9.6286996886364f);//D3
     gl.glVertex2f(5.0869595793222f,9.4941451701101f);//E3
     gl.glVertex2f(5.1318110854976f,9.2943520971468f);//F3
     gl.glVertex2f(5.1685077723684f,9.0986364338358f);//G3
     gl.glVertex2f(5.176662591673f,8.866224083654f);//H3
     gl.glVertex2f(5.1685077723684f,8.6582761913861f);//I3
     gl.glVertex2f(5.0991918082791f,8.4136316122473f);//J3
     gl.glVertex2f(5.0380306634944f,8.1649096234562f);//K3
     gl.glVertex2f(4.980946928362f,7.9569617311883f);//L3
     gl.glVertex2f(4.927940602882f,7.7286267906588f);//M3
     gl.glVertex2f(4.8463924098357f,7.5451433563048f);//N3
     gl.glVertex2f(4.7483497524111f,7.3233219324238f);//O3
     gl.glVertex2f(4.6652402542339f,7.0739934378922f);//P3
     gl.glVertex2f(4.5527979919941f,6.8979968535169f);//Q3
     gl.glVertex2f(4.4208005537127f,6.7317778571625f);//R3
     gl.glEnd();
     
     //CABEZA
        gl.glColor3f(0f, 0f, 0f);
        gl.glLineWidth(2);
        gl.glBegin(GL.GL_LINE_LOOP);
        gl.glVertex2f(3.5818740329298f,5.7376946066603f);//P
        gl.glVertex2f(2.6922244534938f,6.6964421836133f);//D2
        gl.glVertex2f(2.5558346101902f,6.8471888525279f);//E2
        gl.glVertex2f(2.4625152437192f,7.1199685391352f);//F2
        gl.glVertex2f(2.3835527028592f,7.3855698129371f);//G2
        gl.glVertex2f(2.3381244176057f,7.5811610968791f);//H2
        gl.glVertex2f(2.3620437113287f,7.687089397652f);//I2
        gl.glVertex2f(2.4474697603391f,7.7075916494145f);//J2
        gl.glVertex2f(2.4440527183787f,7.8647755795937f);//K2
        gl.glVertex2f(2.4543038442599f,8.0937173909416f);//L2
        gl.glVertex2f(2.4918913058245f,8.4456727128645f);//M2
        gl.glVertex2f(2.5567083460436f,8.689381676197f);//N2
        gl.glVertex2f(2.7492961950327f,9.4032849095188f);//O2
        gl.glVertex2f(2.8782139150668f,9.7139412275214f);//P2
        gl.glVertex2f(2.96153798024f,9.9123318588861f);//Q2
        gl.glVertex2f(3.0885079843134f,10.0353340503322f);//R2
        gl.glVertex2f(3.2749951777961f,10.1384971786418f);//S2
        gl.glVertex2f(3.4396860797879f,10.2403111364833f);//T2
        gl.glVertex2f(3.5946276465758f,10.2566207750925f);//U2
        gl.glVertex2f(3.9289752380654f,10.2810852330064f);//V2
        gl.glVertex2f(4.2551680102504f,10.2117692689171f);//W2
        gl.glVertex2f(4.53650927626f,10.1016792083047f);//Z2
        gl.glVertex2f(4.6914508430479f,9.9956665573445f);//A3
        gl.glVertex2f(4.8056183133126f,9.8814990870798f);//B3
        gl.glVertex2f(4.9116309642727f,9.7510219782058f);//C3
        gl.glVertex2f(5.0176436152328f,9.6286996886364f);//D3
        gl.glVertex2f(5.0869595793222f,9.4941451701101f);//E3
        gl.glVertex2f(5.1318110854976f,9.2943520971468f);//F3
        gl.glVertex2f(5.1685077723684f,9.0986364338358f);//G3
        gl.glVertex2f(5.176662591673f,8.866224083654f);//H3
        gl.glVertex2f(5.1685077723684f,8.6582761913861f);//I3
        gl.glVertex2f(5.0991918082791f,8.4136316122473f);//J3
        gl.glVertex2f(5.0380306634944f,8.1649096234562f);//K3
        gl.glVertex2f(4.980946928362f,7.9569617311883f);//L3
        gl.glVertex2f(4.927940602882f,7.7286267906588f);//M3
        gl.glVertex2f(4.8463924098357f,7.5451433563048f);//N3
        gl.glVertex2f(4.7483497524111f,7.3233219324238f);//O3
        gl.glVertex2f(4.6652402542339f,7.0739934378922f);//P3
        gl.glVertex2f(4.5527979919941f,6.8979968535169f);//Q3
        gl.glVertex2f(4.4208005537127f,6.7317778571625f);//R3
        gl.glEnd();
    }
    
    public void cabellorick (GL gl)
    {
     gl.glColor3f(0.61f, 0.95f, 0.95f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON); //LINE_LOOP
     gl.glVertex2f(2.4f,7.2f);//S3
     gl.glVertex2f(2.1131497461395f,7.2921686289166f);//T3
     gl.glVertex2f(2.2731242072748f,7.5223757803063f);//U3
     gl.glVertex2f(2f,7.6f);//V3
     gl.glVertex2f(2.323847816903f,7.9164592089565f);//W3
     gl.glVertex2f(2.2770260234f,8.064728221716f);//Z3
     gl.glVertex2f(1.8166117206206f,8.3651680633603f);//A4
     gl.glVertex2f(2.058524320386f,8.501731627744f);//B4
     gl.glVertex2f(2.2770260234f,8.7280369630085f);//C4
     gl.glVertex2f(2.3421852820391f,8.8031496000511f);//D4
     gl.glVertex2f(2.3269649871928f,8.9325221062448f);//E4
     gl.glVertex2f(2.1336545590654f,9.1445357400225f);//F4
     gl.glVertex2f(1.8635450598594f,9.3977633955281f);//G4
     gl.glVertex2f(1.8230286349785f,9.4382798204091f);//H4
     gl.glVertex2f(1.8826483382812f,9.4754198765499f);//I4
     gl.glVertex2f(2.099570071773f,9.4804772042795f);//J4
     gl.glVertex2f(2.2879350252687f,9.537659422305f);//K4
     gl.glVertex2f(2.57720977528f,9.719297056033f);//L4
     gl.glVertex2f(2.6204428416557f,9.7600586538520f);//M4
     gl.glVertex2f(2.5800046852823f,9.8303858823275f);//N4
     gl.glVertex2f(2.4019973136753f,10.1502412072223f);//O4
     gl.glVertex2f(2.2835182202866f,10.4661854562588f);//P4
     gl.glVertex2f(2.2005828549146f,10.7386873710527f);//Q4
     gl.glVertex2f(2.4217438292401f,10.6557520056806f);//R4
     gl.glVertex2f(2.7337387751636f,10.5175263967272f);//S4
     gl.glVertex2f(3.0773281459907f,10.446438940694f);//T4
     gl.glVertex2f(3.0786148831199f,10.9053420818546f);//U4
     gl.glVertex2f(3.1186812168214f,11.2412828798133f);//V4
     gl.glVertex2f(3.2142240125712f,11.4970910103691f);//W4
     gl.glVertex2f(3.2789465516274f,11.6758484991912f);//Z4
     gl.glVertex2f(3.3216348099037f,11.7237112656202f);//A5
     gl.glVertex2f(3.3482007606336f,11.6705793641604f);//B5
     gl.glVertex2f(3.3965808990395f,11.5490365974443f);//C5
     gl.glVertex2f(3.5087807828719f,11.3222059511188f);//D5
     gl.glVertex2f(3.6740759322063f,11.0987513973891f);//E5
     gl.glVertex2f(3.8312049575441f,10.8914575383926f);//F5
     gl.glVertex2f(4.0353805976349f,10.6723422173195f);//G5
     gl.glVertex2f(4.4611615056293f,11.0383644013848f);//H5
     gl.glVertex2f(4.9158672858932f,11.3378597526485f);//I5
     gl.glVertex2f(5.2748771677033f,11.5472473223298f);//J5
     gl.glVertex2f(5.4154301070755f,11.628335556583f);//K5
     gl.glVertex2f(5.3878905474168f,11.4963395749472f);//L5
     gl.glVertex2f(5.3505595196729f,11.3310120309881f);//M5
     gl.glVertex2f(5.2100065803008f,10.7525826266489f);//N5
     gl.glVertex2f(5.1343242283312f,10.1795591045933f);//O5
     gl.glVertex2f(5.6142466493918f,10.0939291924458f);//P5
     gl.glVertex2f(6.2380609156229f,10.0638140209726f);//Q5
     gl.glVertex2f(6.306895593276f,10.0380010168527f);//R5
     gl.glVertex2f(6.2466652503295f,9.9562598371397f);//S5
     gl.glVertex2f(5.9498157029506f,9.5518561059278f);//T5
     gl.glVertex2f(5.5884336452719f,9.0915241991228f);//U5
     gl.glVertex2f(5.9713265397172f,8.7817681496839f);//V5
     gl.glVertex2f(6.3241042626892f,8.5279402758381f);//W5
     gl.glVertex2f(6.4402627812288f,8.4505012634784f);//Z5
     gl.glVertex2f(6.3284064300426f,8.4160839246519f);//A6
     gl.glVertex2f(5.5368076370321f,8.2095798916926f);//B6
     gl.glVertex2f(5.4249512858458f,8.1493495487462f);//C6
     gl.glVertex2f(5.4722751267323f,8.0762127037398f);//D6
     gl.glVertex2f(5.7063609209901f,7.8471389257575f);//E6
     gl.glVertex2f(5.9841011467532f,7.5445264409709f);//F6
     gl.glVertex2f(6.050427170816f,7.4740550404042f);//G6
     gl.glVertex2f(5.9758103937453f,7.4491827813806f);//H6
     gl.glVertex2f(5.6275987674155f,7.4118743928453f);//I6
     gl.glVertex2f(5.3540039181564f,7.3455483687825f);//J6
     gl.glVertex2f(5.2918232705975f,7.3206761097589f);//K6
     gl.glVertex2f(5.4161845657153f,6.8605393178231f);//L6
     gl.glVertex2f(5.0762636923933f,6.9310107183899f);//M6
     gl.glVertex2f(4.7695058311028f,6.9931913659488f);//N6
     gl.glVertex2f(4.8f,6.8f);//O6
     gl.glVertex2f(4.8f,6.6f);//P6
     gl.glVertex2f(4.4208005537127f,6.7317778571625f);//R3
     gl.glEnd();
     
     //CABELLO
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP); //LINE_LOOP
     gl.glVertex2f(2.4f,7.2f);//S3
     gl.glVertex2f(2.1131497461395f,7.2921686289166f);//T3
     gl.glVertex2f(2.2731242072748f,7.5223757803063f);//U3
     gl.glVertex2f(2f,7.6f);//V3
     gl.glVertex2f(2.323847816903f,7.9164592089565f);//W3
     gl.glVertex2f(2.2770260234f,8.064728221716f);//Z3
     gl.glVertex2f(1.8166117206206f,8.3651680633603f);//A4
     gl.glVertex2f(2.058524320386f,8.501731627744f);//B4
     gl.glVertex2f(2.2770260234f,8.7280369630085f);//C4
     gl.glVertex2f(2.3421852820391f,8.8031496000511f);//D4
     gl.glVertex2f(2.3269649871928f,8.9325221062448f);//E4
     gl.glVertex2f(2.1336545590654f,9.1445357400225f);//F4
     gl.glVertex2f(1.8635450598594f,9.3977633955281f);//G4
     gl.glVertex2f(1.8230286349785f,9.4382798204091f);//H4
     gl.glVertex2f(1.8826483382812f,9.4754198765499f);//I4
     gl.glVertex2f(2.099570071773f,9.4804772042795f);//J4
     gl.glVertex2f(2.2879350252687f,9.537659422305f);//K4
     gl.glVertex2f(2.57720977528f,9.719297056033f);//L4
     gl.glVertex2f(2.6204428416557f,9.7600586538520f);//M4
     gl.glVertex2f(2.5800046852823f,9.8303858823275f);//N4
     gl.glVertex2f(2.4019973136753f,10.1502412072223f);//O4
     gl.glVertex2f(2.2835182202866f,10.4661854562588f);//P4
     gl.glVertex2f(2.2005828549146f,10.7386873710527f);//Q4
     gl.glVertex2f(2.4217438292401f,10.6557520056806f);//R4
     gl.glVertex2f(2.7337387751636f,10.5175263967272f);//S4
     gl.glVertex2f(3.0773281459907f,10.446438940694f);//T4
     gl.glVertex2f(3.0786148831199f,10.9053420818546f);//U4
     gl.glVertex2f(3.1186812168214f,11.2412828798133f);//V4
     gl.glVertex2f(3.2142240125712f,11.4970910103691f);//W4
     gl.glVertex2f(3.2789465516274f,11.6758484991912f);//Z4
     gl.glVertex2f(3.3216348099037f,11.7237112656202f);//A5
     gl.glVertex2f(3.3482007606336f,11.6705793641604f);//B5
     gl.glVertex2f(3.3965808990395f,11.5490365974443f);//C5
     gl.glVertex2f(3.5087807828719f,11.3222059511188f);//D5
     gl.glVertex2f(3.6740759322063f,11.0987513973891f);//E5
     gl.glVertex2f(3.8312049575441f,10.8914575383926f);//F5
     gl.glVertex2f(4.0353805976349f,10.6723422173195f);//G5
     gl.glVertex2f(4.4611615056293f,11.0383644013848f);//H5
     gl.glVertex2f(4.9158672858932f,11.3378597526485f);//I5
     gl.glVertex2f(5.2748771677033f,11.5472473223298f);//J5
     gl.glVertex2f(5.4154301070755f,11.628335556583f);//K5
     gl.glVertex2f(5.3878905474168f,11.4963395749472f);//L5
     gl.glVertex2f(5.3505595196729f,11.3310120309881f);//M5
     gl.glVertex2f(5.2100065803008f,10.7525826266489f);//N5
     gl.glVertex2f(5.1343242283312f,10.1795591045933f);//O5
     gl.glVertex2f(5.6142466493918f,10.0939291924458f);//P5
     gl.glVertex2f(6.2380609156229f,10.0638140209726f);//Q5
     gl.glVertex2f(6.306895593276f,10.0380010168527f);//R5
     gl.glVertex2f(6.2466652503295f,9.9562598371397f);//S5
     gl.glVertex2f(5.9498157029506f,9.5518561059278f);//T5
     gl.glVertex2f(5.5884336452719f,9.0915241991228f);//U5
     gl.glVertex2f(5.9713265397172f,8.7817681496839f);//V5
     gl.glVertex2f(6.3241042626892f,8.5279402758381f);//W5
     gl.glVertex2f(6.4402627812288f,8.4505012634784f);//Z5
     gl.glVertex2f(6.3284064300426f,8.4160839246519f);//A6
     gl.glVertex2f(5.5368076370321f,8.2095798916926f);//B6
     gl.glVertex2f(5.4249512858458f,8.1493495487462f);//C6
     gl.glVertex2f(5.4722751267323f,8.0762127037398f);//D6
     gl.glVertex2f(5.7063609209901f,7.8471389257575f);//E6
     gl.glVertex2f(5.9841011467532f,7.5445264409709f);//F6
     gl.glVertex2f(6.050427170816f,7.4740550404042f);//G6
     gl.glVertex2f(5.9758103937453f,7.4491827813806f);//H6
     gl.glVertex2f(5.6275987674155f,7.4118743928453f);//I6
     gl.glVertex2f(5.3540039181564f,7.3455483687825f);//J6
     gl.glVertex2f(5.2918232705975f,7.3206761097589f);//K6
     gl.glVertex2f(5.4161845657153f,6.8605393178231f);//L6
     gl.glVertex2f(5.0762636923933f,6.9310107183899f);//M6
     gl.glVertex2f(4.7695058311028f,6.9931913659488f);//N6
     gl.glVertex2f(4.8f,6.8f);//O6
     gl.glVertex2f(4.8f,6.6f);//P6
     gl.glVertex2f(4.4208005537127f,6.7317778571625f);//R3
     gl.glEnd();
    }
    
    public void brazorick(GL gl)
    {
     gl.glColor3f(1f, 1f, 1f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON); //LINE_LOOP
     gl.glVertex2f(7.0095690243074f,4.0768259993267f);//Q6
     gl.glVertex2f(7.2743160888752f,4.2422929146816f);//R6
     gl.glVertex2f(7.4596390340727f,4.1430127654687f);//S6
     gl.glVertex2f(7.5920125663566f,3.984164526728f);//T6
     gl.glVertex2f(7.6383433026559f,3.7988415815305f);//U6
     gl.glVertex2f(7.5986312429708f,3.6333746661756f);//V6
     gl.glVertex2f(7.5f,3.5f);//W6
     gl.glVertex2f(7.3140281485604f,3.1171178902684f);//Z6
     gl.glVertex2f(7.1220865267487f,2.8060400894012f);//A7
     gl.glVertex2f(6.8970515218661f,2.4552502288489f);//B7
     gl.glVertex2f(6.5f,2f);//C7
     gl.glVertex2f(6.2484212136749f,1.6411530053029f);//D7
     gl.glVertex2f(6.0233862087923f,1.3631685875067f);//E7
     gl.glVertex2f(5.7255457611535f,1.3565499108925f);//G7
     gl.glVertex2f(5.573316199027f,1.4293553536486f);//H7
     gl.glVertex2f(5.1894329554037f,1.8595693335713f);//I7
     gl.glVertex2f(5.335043840916f,2.0316549255404f);//J7
     gl.glVertex2f(5.7123084079251f,2.4221568457779f);//K7
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP); //LINE_LOOP
     gl.glVertex2f(7.0095690243074f,4.0768259993267f);//Q6
     gl.glVertex2f(7.2743160888752f,4.2422929146816f);//R6
     gl.glVertex2f(7.4596390340727f,4.1430127654687f);//S6
     gl.glVertex2f(7.5920125663566f,3.984164526728f);//T6
     gl.glVertex2f(7.6383433026559f,3.7988415815305f);//U6
     gl.glVertex2f(7.5986312429708f,3.6333746661756f);//V6
     gl.glVertex2f(7.5f,3.5f);//W6
     gl.glVertex2f(7.3140281485604f,3.1171178902684f);//Z6
     gl.glVertex2f(7.1220865267487f,2.8060400894012f);//A7
     gl.glVertex2f(6.8970515218661f,2.4552502288489f);//B7
     gl.glVertex2f(6.5f,2f);//C7
     gl.glVertex2f(6.2484212136749f,1.6411530053029f);//D7
     gl.glVertex2f(6.0233862087923f,1.3631685875067f);//E7
     gl.glVertex2f(5.7255457611535f,1.3565499108925f);//G7
     gl.glVertex2f(5.573316199027f,1.4293553536486f);//H7
     gl.glVertex2f(5.1894329554037f,1.8595693335713f);//I7
     gl.glVertex2f(5.335043840916f,2.0316549255404f);//J7
     gl.glVertex2f(5.7123084079251f,2.4221568457779f);//K7
     gl.glEnd();
     
    }
    
    public void manga1rick(GL gl)
    {
     gl.glColor3f(0.69f, 0.96f, 0.86f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON); //LINE_LOOP
     gl.glVertex2f(5.2975561797669f,1.8546348351397f);//L7
     gl.glVertex2f(5.5298881844234f,1.8662514353725f);//M7
     gl.glVertex2f(5.642181986674f,1.8042962341308f);//N7
     gl.glVertex2f(5.7699645892351f,1.6726414314921f);//O7
     gl.glVertex2f(5.6576707869845f,1.5526032290862f);//P7
     gl.glVertex2f(5.4950383837249f,1.4093318262147f);//Q7
     gl.glVertex2f(5.1155627761193f,1.6029418300951f);//R7
     gl.glEnd();
     
     gl.glColor3f(0, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP); //LINE_LOOP
     gl.glVertex2f(5.2975561797669f,1.8546348351397f);//L7
     gl.glVertex2f(5.5298881844234f,1.8662514353725f);//M7
     gl.glVertex2f(5.642181986674f,1.8042962341308f);//N7
     gl.glVertex2f(5.7699645892351f,1.6726414314921f);//O7
     gl.glVertex2f(5.6576707869845f,1.5526032290862f);//P7
     gl.glVertex2f(5.4950383837249f,1.4093318262147f);//Q7
     gl.glVertex2f(5.1155627761193f,1.6029418300951f);//R7
     gl.glEnd();
    }
    
    public void manga2rick(GL gl)
    {
     gl.glColor3f(0.69f, 0.96f, 0.86f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON); //LINE_LOOP
     gl.glVertex2f(2.6f,5.4f);//S7
     gl.glVertex2f(2.8855770374251f,5.7461345702422f);//Z1
     gl.glVertex2f(2.7716375290697f,5.7841144063606f);//A2
     gl.glVertex2f(2.6914578750419f,5.8389741696428f);//B2
     gl.glVertex2f(2.6239381663869f,5.893833932925f);//C2
     gl.glVertex2f(2.599612321892f,6.032748943532f);//C1
     gl.glVertex2f(2.4024882413658f,5.8437870176716f);//T7
     gl.glVertex2f(2.3938646561686f,5.6971860693187f);//U7
     gl.glVertex2f(2.4369825821547f,5.5850794617547f);//V7
     gl.glVertex2f(2.5059712637326f,5.5031554023809f);//W7
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP); //LINE_LOOP
     gl.glVertex2f(2.6f,5.4f);//S7
     gl.glVertex2f(2.8855770374251f,5.7461345702422f);//Z1
     gl.glVertex2f(2.7716375290697f,5.7841144063606f);//A2
     gl.glVertex2f(2.6914578750419f,5.8389741696428f);//B2
     gl.glVertex2f(2.6239381663869f,5.893833932925f);//C2
     gl.glVertex2f(2.599612321892f,6.032748943532f);//C1
     gl.glVertex2f(2.4024882413658f,5.8437870176716f);//T7
     gl.glVertex2f(2.3938646561686f,5.6971860693187f);//U7
     gl.glVertex2f(2.4369825821547f,5.5850794617547f);//V7
     gl.glVertex2f(2.5059712637326f,5.5031554023809f);//W7
     gl.glEnd();
    }
    
    public void cuerporick(GL gl)
    {
     gl.glColor3f(0.69f, 0.96f, 0.86f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON); //LINE_LOOP
     gl.glVertex2f(3.0646493242604f,0.9418438307878f);//B8
     gl.glVertex2f(3.8769247042405f,0.9552329854029f);//Z7
     gl.glVertex2f(4.5463824349934f,2.414650838444f);//A8
     gl.glVertex2f(3.4534409276199f,2.9643186523054f);//R
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP); //LINE_LOOP
     gl.glVertex2f(3.0646493242604f,0.9418438307878f);//B8
     gl.glVertex2f(3.8769247042405f,0.9552329854029f);//Z7
     gl.glVertex2f(4.5463824349934f,2.414650838444f);//A8
     gl.glVertex2f(3.4534409276199f,2.9643186523054f);//R
     gl.glEnd();
    }
    
    public void mano2rick(GL gl)
    {
     gl.glColor3f(0.92f, 0.91f, 0.84f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(5.1155627761193f,1.6029418300951f);//R7
     gl.glVertex2f(5.2657057982152f,1.6049995834316f);//C8
     gl.glVertex2f(5.3942124575774f,1.5471715867187f);//D8
     gl.glVertex2f(5.4950383837249f,1.4093318262147f);//Q7
     gl.glVertex2f(5.5034431180353f,1.2837329350262f);//E8
     gl.glVertex2f(5.4905924520991f,1.1359502767596f);//F8
     gl.glVertex2f(5.4605738315864f,1.0245508519832f);//G8
     gl.glVertex2f(5.387868084597f,0.9219074444688f);//H8
     gl.glVertex2f(5.387868084597f,0.8534785061258f);//I8
     gl.glVertex2f(5.4f,0.8f);//J8
     gl.glVertex2f(5.4006985105363f,0.6909597775614f);//K8
     gl.glVertex2f(5.3622072327184f,0.5626555181684f);//L8
     gl.glVertex2f(5.3066087203148f,0.4471816847147f);//M8
     gl.glVertex2f(5.2467333992647f,0.3445382772003f);//N8
     gl.glVertex2f(5.1440899917503f,0.2974933820895f);//O8
     gl.glVertex2f(5.0713842447609f,0.3017701907359f);//P8
     gl.glVertex2f(5.002955306418f,0.3445382772003f);//Q8
     gl.glVertex2f(4.9601872199536f,0.3958599809575f);//R8
     gl.glVertex2f(4.934526368075f,0.3103238080288f);//S8
     gl.glVertex2f(4.8361597692071f,0.3274310426145f);//T8
     gl.glVertex2f(4.7720076395106f,0.3701991290789f);//U8
     gl.glVertex2f(4.7348770231929f,0.4390177157131f);//V8
     gl.glVertex2f(4.7086316988774f,0.3981916556667f);//W8
     gl.glVertex2f(4.6357280202231f,0.4302692742746f);//Z8
     gl.glVertex2f(4.5628243415687f,0.471095334321f);//A9
     gl.glVertex2f(4.5424113115455f,0.5177536886598f);//B9
     gl.glVertex2f(4.4957529572068f,0.5177536886598f);//C9
     gl.glVertex2f(4.4549268971603f,0.5498313072677f);//D9
     gl.glVertex2f(4.4f,0.6f);//E9
     gl.glVertex2f(4.4f,0.8f);//F9
     gl.glVertex2f(4.4053523956754f,0.9610080548781f);//G9
     gl.glVertex2f(4.4345138671371f,1.1213961479176f);//H9
     gl.glVertex2f(4.4f,1.2f);//I9
     gl.glVertex2f(4.5132498400838f,1.3226103010035f);//J9
     gl.glVertex2f(4.8136129961396f,1.50049527692f);//K9
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(5.1155627761193f,1.6029418300951f);//R7
     gl.glVertex2f(5.2657057982152f,1.6049995834316f);//C8
     gl.glVertex2f(5.3942124575774f,1.5471715867187f);//D8
     gl.glVertex2f(5.4950383837249f,1.4093318262147f);//Q7
     gl.glVertex2f(5.5034431180353f,1.2837329350262f);//E8
     gl.glVertex2f(5.4905924520991f,1.1359502767596f);//F8
     gl.glVertex2f(5.4605738315864f,1.0245508519832f);//G8
     gl.glVertex2f(5.387868084597f,0.9219074444688f);//H8
     gl.glVertex2f(5.387868084597f,0.8534785061258f);//I8
     gl.glVertex2f(5.4f,0.8f);//J8
     gl.glVertex2f(5.4006985105363f,0.6909597775614f);//K8
     gl.glVertex2f(5.3622072327184f,0.5626555181684f);//L8
     gl.glVertex2f(5.3066087203148f,0.4471816847147f);//M8
     gl.glVertex2f(5.2467333992647f,0.3445382772003f);//N8
     gl.glVertex2f(5.1440899917503f,0.2974933820895f);//O8
     gl.glVertex2f(5.0713842447609f,0.3017701907359f);//P8
     gl.glVertex2f(5.002955306418f,0.3445382772003f);//Q8
     gl.glVertex2f(4.9601872199536f,0.3958599809575f);//R8
     gl.glVertex2f(4.934526368075f,0.3103238080288f);//S8
     gl.glVertex2f(4.8361597692071f,0.3274310426145f);//T8
     gl.glVertex2f(4.7720076395106f,0.3701991290789f);//U8
     gl.glVertex2f(4.7348770231929f,0.4390177157131f);//V8
     gl.glVertex2f(4.7086316988774f,0.3981916556667f);//W8
     gl.glVertex2f(4.6357280202231f,0.4302692742746f);//Z8
     gl.glVertex2f(4.5628243415687f,0.471095334321f);//A9
     gl.glVertex2f(4.5424113115455f,0.5177536886598f);//B9
     gl.glVertex2f(4.4957529572068f,0.5177536886598f);//C9
     gl.glVertex2f(4.4549268971603f,0.5498313072677f);//D9
     gl.glVertex2f(4.4f,0.6f);//E9
     gl.glVertex2f(4.4f,0.8f);//F9
     gl.glVertex2f(4.4053523956754f,0.9610080548781f);//G9
     gl.glVertex2f(4.4345138671371f,1.1213961479176f);//H9
     gl.glVertex2f(4.4f,1.2f);//I9
     gl.glVertex2f(4.5132498400838f,1.3226103010035f);//J9
     gl.glVertex2f(4.8136129961396f,1.50049527692f);//K9
     gl.glEnd();
     
    }
    
    public void contornosrick(GL gl)
    {
     //BATA RICK
        gl.glColor3f(0, 0, 0);
        gl.glLineWidth(2);
        gl.glBegin(GL.GL_LINE_LOOP);
        gl.glVertex2f(2,0);//A
        gl.glVertex2f(2.1172874634104f,1.4438716390631f);//C
        gl.glVertex2f(2.0110485581613f,2.6974907210023f);//D
        gl.glVertex2f(2.0216724486862f,4.1954592850143f);//E
        gl.glVertex2f(0.778677257272f,3.0480791083242f);//F
        gl.glVertex2f(0.5237038846742f,2.9418402030751f);//G
        gl.glVertex2f(0.3430977457508f,3.0268313272744f);//H
        gl.glVertex2f(0.204987168927f,3.2074374661978f);//I
        gl.glVertex2f(0.2262349499768f,3.4411630577458f);//J
        gl.glVertex2f(0.3749694173255f,3.7917514450678f);//K
        gl.glVertex2f(0.7999250383218f,4.6204149060106f);//L
        gl.glVertex2f(1.3417434550921f,5.3534633522293f);//M
        gl.glVertex2f(2.0854157918357f,6.309613499471f);//N
        gl.glVertex2f(2.276645821284f,6.4477240762948f);//O
        gl.glVertex2f(2.967198705403f,6.4477240762948f);//P
        gl.glVertex2f(3.4534409276199f,2.9643186523054f);//R
        gl.glVertex2f(3.1496057793683f,1.006269919128f);//S
        gl.glVertex2f(2.900848155422f,0);//T
        gl.glEnd();
        
        //CINTURON
        
        
        //PANTALON
        gl.glColor3f(0f, 0f, 0f);
        gl.glLineWidth(2);
        gl.glBegin(GL.GL_LINE_LOOP);
        gl.glVertex2f(3.0650294033969f,0.5858291378258f);//A1
        gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
        gl.glVertex2f(5.1537810562002f,0.6499574780434f);//W
        gl.glVertex2f(5.3640899970855f,0);//B1
        gl.glVertex2f(2.900848155422f,0);//T
        gl.glEnd(); 
        
        
        
    }
    
    public void cabezamorty(GL gl)
    {
     gl.glColor3f(0.96f, 0.86f, 0.69f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(5.7658783822299f,6.0142196319202f);//L9
     gl.glVertex2f(6.6047873732088f,5.3293930608521f);//M9
     gl.glVertex2f(6.7309333232057f,5.0474197608591f);//N9 
     gl.glVertex2f(6.8273978732033f,4.8990127608628f);//O9 
     gl.glVertex2f(6.9238624232009f,4.6986633108678f);//P9 
     gl.glVertex2f(7f,4.5f);//Q9 
     gl.glVertex2f(6.9983614144442f,4.3194867327643f);//R9 
     gl.glVertex2f(7.0095690243074f,4.0768259993267f);//Q6 
     gl.glVertex2f(6.9983614144442f,3.8839812066854f);//S9 
     gl.glVertex2f(6.9327372940761f,3.6334163834619f);//T9
     gl.glVertex2f(6.8611473445837f,3.4484756806064f);//U9
     gl.glVertex2f(6.7656940785938f,3.2575691486266f);//V9 
     gl.glVertex2f(6.640411666982f,3.102457591393f);//W9 
     gl.glVertex2f(6.5091634262459f,2.9354143759107f);//Z9 
     gl.glVertex2f(6.3301885525148f,2.8041661351746f);//A10 
     gl.glVertex2f(6.1213845331619f,2.6848495526872f);//B10
     gl.glVertex2f(5.9543413176796f,2.5834304575729f);//C10
     gl.glVertex2f(5.7123084079251f,2.4221568457779f);//K7
     gl.glVertex2f(5.5367332789737f,2.4283189003393f);//D10
     gl.glVertex2f(5.3875875508645f,2.4283189003393f);//E10
     gl.glVertex2f(5.1310568985166f,2.4342847294637f);//F10
     gl.glVertex2f(4.8983895626662f,2.4820113624586f);//G10
     gl.glVertex2f(4.6895855433133f,2.5297379954536f);//H10
     gl.glVertex2f(4.641586682988f,2.5697250693074f);//I10
     gl.glVertex2f(4.5574706496603f,2.5159842702369f);//J10
     gl.glVertex2f(4.340170896897f,2.5253304961622f);//K10
     gl.glVertex2f(4.2350258552373f,2.616456198934f);//L10
     gl.glVertex2f(4.118198031171f,2.7216012405936f);//M10
     gl.glVertex2f(4.0901593533951f,2.8945064202118f);//N10
     gl.glVertex2f(3.9035839962121f,3.0884243092556f);//O10
     gl.glVertex2f(3.7672550012218f,3.2725825568808f);//P10
     gl.glVertex2f(3.6050152197305f,3.5670177158834f);//Q10
     gl.glVertex2f(3.5f,4f);//R10
     gl.glVertex2f(3.4788287230151f,4.3541811001558f);//S10
     gl.glVertex2f(3.5509352925668f,4.7808116366699f);//T10
     gl.glVertex2f(3.6771217892822f,5.1052911996524f);//U10
     gl.glVertex2f(3.8573882131614f,5.4117441202469f);//V10
     gl.glVertex2f(4.0316457562446f,5.6460904712899f);//W10
     gl.glVertex2f(4.2780098688794f,5.8443835375569f);//Z10
     gl.glVertex2f(4.5f,6f);//A11
     gl.glVertex2f(4.6806380287766f,6.0481398768324f);//B11
     gl.glVertex2f(4.8991965367436f,6.1091487893034f);//C11
     gl.glVertex2f(5.1210350083605f,6.1253808725924f);//D11
     gl.glVertex2f(5.3536948688367f,6.1145594837331f);//E11
     gl.glVertex2f(5.5755333404536f,6.0766846227253f);//F11
      gl.glEnd();
      
      gl.glColor3f(0, 0, 0);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(5.7658783822299f,6.0142196319202f);//L9
     gl.glVertex2f(6.6047873732088f,5.3293930608521f);//M9
     gl.glVertex2f(6.7309333232057f,5.0474197608591f);//N9 
     gl.glVertex2f(6.8273978732033f,4.8990127608628f);//O9 
     gl.glVertex2f(6.9238624232009f,4.6986633108678f);//P9 
     gl.glVertex2f(7f,4.5f);//Q9 
     gl.glVertex2f(6.9983614144442f,4.3194867327643f);//R9 
     gl.glVertex2f(7.0095690243074f,4.0768259993267f);//Q6 
     gl.glVertex2f(6.9983614144442f,3.8839812066854f);//S9 
     gl.glVertex2f(6.9327372940761f,3.6334163834619f);//T9
     gl.glVertex2f(6.8611473445837f,3.4484756806064f);//U9
     gl.glVertex2f(6.7656940785938f,3.2575691486266f);//V9 
     gl.glVertex2f(6.640411666982f,3.102457591393f);//W9 
     gl.glVertex2f(6.5091634262459f,2.9354143759107f);//Z9 
     gl.glVertex2f(6.3301885525148f,2.8041661351746f);//A10 
     gl.glVertex2f(6.1213845331619f,2.6848495526872f);//B10
     gl.glVertex2f(5.9543413176796f,2.5834304575729f);//C10
     gl.glVertex2f(5.7123084079251f,2.4221568457779f);//K7
     gl.glVertex2f(5.5367332789737f,2.4283189003393f);//D10
     gl.glVertex2f(5.3875875508645f,2.4283189003393f);//E10
     gl.glVertex2f(5.1310568985166f,2.4342847294637f);//F10
     gl.glVertex2f(4.8983895626662f,2.4820113624586f);//G10
     gl.glVertex2f(4.6895855433133f,2.5297379954536f);//H10
     gl.glVertex2f(4.641586682988f,2.5697250693074f);//I10
     gl.glVertex2f(4.5574706496603f,2.5159842702369f);//J10
     gl.glVertex2f(4.340170896897f,2.5253304961622f);//K10
     gl.glVertex2f(4.2350258552373f,2.616456198934f);//L10
     gl.glVertex2f(4.118198031171f,2.7216012405936f);//M10
     gl.glVertex2f(4.0901593533951f,2.8945064202118f);//N10
     gl.glVertex2f(3.9035839962121f,3.0884243092556f);//O10
     gl.glVertex2f(3.7672550012218f,3.2725825568808f);//P10
     gl.glVertex2f(3.6050152197305f,3.5670177158834f);//Q10
     gl.glVertex2f(3.5f,4f);//R10
     gl.glVertex2f(3.4788287230151f,4.3541811001558f);//S10
     gl.glVertex2f(3.5509352925668f,4.7808116366699f);//T10
     gl.glVertex2f(3.6771217892822f,5.1052911996524f);//U10
     gl.glVertex2f(3.8573882131614f,5.4117441202469f);//V10
     gl.glVertex2f(4.0316457562446f,5.6460904712899f);//W10
     gl.glVertex2f(4.2780098688794f,5.8443835375569f);//Z10
     gl.glVertex2f(4.5f,6f);//A11
     gl.glVertex2f(4.6806380287766f,6.0481398768324f);//B11
     gl.glVertex2f(4.8991965367436f,6.1091487893034f);//C11
     gl.glVertex2f(5.1210350083605f,6.1253808725924f);//D11
     gl.glVertex2f(5.3536948688367f,6.1145594837331f);//E11
     gl.glVertex2f(5.5755333404536f,6.0766846227253f);//F11
      gl.glEnd();
    }
    
    public void cuerpomorty(GL gl)
    {
     gl.glColor3f(0.98f, 0.98f, 0.47f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(7.6796724713109f,0.0312955760772f);//G11
     gl.glVertex2f(6.8970515218661f,2.4552502288489f);//B7
     gl.glVertex2f(4.641586682988f,2.5697250693074f);//I10
     gl.glVertex2f(3.9082202736593f,1.4351904044096f);//H11
     gl.glVertex2f(3.8680544352026f,1.3079985826301f);//I11
     gl.glVertex2f(3.9684690313443f,1.1607238416221f);//J11
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glVertex2f(4.4f,0.6f);//E9
     gl.glVertex2f(5.2467333992647f,0.3445382772003f);//N8
     gl.glVertex2f(5.3640899970855f,0f);//B1
     gl.glEnd();
     
     gl.glColor3f(0.98f, 0.98f, 0.47f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(7.0095690243074f,4.0768259993267f);//Q6
     gl.glVertex2f(7.2743160888752f,4.2422929146816f);//R6
     gl.glVertex2f(7.5686418411997f,4.4452671704028f);//K11
     gl.glVertex2f(7.4676520922619f,4.8408103537427f);//L11
     gl.glVertex2f(7.2572567819747f,5.0932847260874f);//M11
     gl.glVertex2f(7.072108908922f,5.1774428502022f);//N11
     gl.glVertex2f(6.8273978732033f,4.8990127608628f);//O9
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(7.6796724713109f,0.0312955760772f);//G11
     gl.glVertex2f(6.8970515218661f,2.4552502288489f);//B7
     gl.glVertex2f(4.641586682988f,2.5697250693074f);//I10
     gl.glVertex2f(3.9082202736593f,1.4351904044096f);//H11
     gl.glVertex2f(3.8680544352026f,1.3079985826301f);//I11
     gl.glVertex2f(3.9684690313443f,1.1607238416221f);//J11
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glVertex2f(4.4f,0.6f);//E9
     gl.glVertex2f(5.2467333992647f,0.3445382772003f);//N8
     gl.glVertex2f(5.3640899970855f,0f);//B1
     gl.glEnd();
     
      gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(7.0095690243074f,4.0768259993267f);//Q6
     gl.glVertex2f(7.2743160888752f,4.2422929146816f);//R6
     gl.glVertex2f(7.5686418411997f,4.4452671704028f);//K11
     gl.glVertex2f(7.4676520922619f,4.8408103537427f);//L11
     gl.glVertex2f(7.2572567819747f,5.0932847260874f);//M11
     gl.glVertex2f(7.072108908922f,5.1774428502022f);//N11
     gl.glVertex2f(6.8273978732033f,4.8990127608628f);//O9
     gl.glEnd();
    }
    
    public void cabellomorty(GL gl)
    {
     gl.glColor3f(0.61f, 0.45f, 0.08f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(4.340170896897f,2.5253304961622f);//K10
     gl.glVertex2f(3.4534409276199f,2.9643186523054f);//R
     gl.glVertex2f(3.122066548968f,3.3897448408341f);//O11
     gl.glVertex2f(2.9281300226298f,3.8241626598314f);//P11
     gl.glVertex2f(2.8350404899875f,4.3516700114711f);//Q11
     gl.glVertex2f(2.827283028934f,4.8326325967896f);//R11
     gl.glVertex2f(2.9514024057904f,5.2049907273588f);//S11
     gl.glVertex2f(3.0987941658074f,5.5075317084463f);//T11
     gl.glVertex2f(3.2358355260729f,5.7292546430784f);//T1
     gl.glVertex2f(4.1826134386731f,6.4354811286568f);//U11
     gl.glVertex2f(4.4540915060229f,6.4401617849904f);//V11
     gl.glVertex2f(4.6647210410357f,6.4354811286568f);//W11
     gl.glVertex2f(4.8800312323821f,6.5010103173275f);//Z11
     gl.glVertex2f(5.1047027363958f,6.4448424413241f);//A12
     gl.glVertex2f(5.7658783822299f,6.0142196319202f);//L9
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(4.340170896897f,2.5253304961622f);//K10
     gl.glVertex2f(3.4534409276199f,2.9643186523054f);//R
     gl.glVertex2f(3.122066548968f,3.3897448408341f);//O11
     gl.glVertex2f(2.9281300226298f,3.8241626598314f);//P11
     gl.glVertex2f(2.8350404899875f,4.3516700114711f);//Q11
     gl.glVertex2f(2.827283028934f,4.8326325967896f);//R11
     gl.glVertex2f(2.9514024057904f,5.2049907273588f);//S11
     gl.glVertex2f(3.0987941658074f,5.5075317084463f);//T11
     gl.glVertex2f(3.2358355260729f,5.7292546430784f);//T1
     gl.glVertex2f(4.1826134386731f,6.4354811286568f);//U11
     gl.glVertex2f(4.4540915060229f,6.4401617849904f);//V11
     gl.glVertex2f(4.6647210410357f,6.4354811286568f);//W11
     gl.glVertex2f(4.8800312323821f,6.5010103173275f);//Z11
     gl.glVertex2f(5.1047027363958f,6.4448424413241f);//A12
     gl.glVertex2f(5.7658783822299f,6.0142196319202f);//L9
     gl.glEnd();
        
    }
    
    public void brazolargomorty(GL gl)
    {
     gl.glColor3f(0.96f, 0.86f, 0.69f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(7.2572567819747f,5.0932847260874f);//M11
     gl.glVertex2f(7.5325122572522f,4.6579929292802f);//B12
     gl.glVertex2f(8.0631671009201f,5.0607220517067f);//C12
     gl.glEnd();
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(8.0631671009201f,5.0607220517067f);//C12
     gl.glVertex2f(9.6598696215997f,5.8709182862355f);//D12
     gl.glVertex2f(9.5573732659051f,6.3178523860565f);//E13
     gl.glVertex2f(7.8775021712182f,5.5636245476257f);//F13
     gl.glVertex2f(7.2572567819747f,5.0932847260874f);//M11
     gl.glEnd();
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(9.6598696215997f,5.8709182862355f);//D12
     gl.glVertex2f(10.1052406511067f,5.8803942655867f);//E12
     gl.glVertex2f(10.3231881761847f,5.8993462242892f);//F12
     gl.glVertex2f(10.3847820419675f,5.8567043172087f);//G12
     gl.glVertex2f(10.560087659965f,5.8377523585063f);//H12
     gl.glVertex2f(10.6212101454907f,5.8608577118545f);//I12
     gl.glVertex2f(10.5618518173f,5.9468249457858f);//J12
     gl.glVertex2f(10.3469337324715f,6.0860099911985f);//K12
     gl.glVertex2f(10.16271823119f,6.1208062525517f);//L12
     gl.glVertex2f(10.1217814531275f,6.1515088360986f);//M12
     gl.glVertex2f(10.16271823119f,6.2149608420956f);//N12
     gl.glVertex2f(10.5047079084803f,6.5338665130385f);//O12
     gl.glVertex2f(10.7064044568091f,6.7790662384579f);//P12
     gl.glVertex2f(10.762861318566f,6.9665447727995f);//Q12
     gl.glVertex2f(10.7171581447628f,6.9934289926837f);//R12
     gl.glVertex2f(10.6391939070986f,6.9477258188805f);//S12
     gl.glVertex2f(10.1283937292985f,6.5256435666983f);//T12
     gl.glVertex2f(10.4864448305177f,7.0172272907833f);//U12
     gl.glVertex2f(10.4761599054482f,7.178357783539f);//V12
     gl.glVertex2f(10.284174637484f,6.9589460487228f);//W12
     gl.glVertex2f(10.29788787091f,7.212640867104f);//Z12
     gl.glVertex2f(10.0956176778763f,6.9589460487228f);//A13
     gl.glVertex2f(10.0990459862328f,7.1269331581914f);//B13
     gl.glVertex2f(10.0441930525287f,7.185214400252f);//C13
     gl.glVertex2f(9.7699283840084f,6.6915379969154f);//D13
     gl.glVertex2f(9.5573732659051f,6.3178523860565f);//E13
     gl.glVertex2f(7.8775021712182f,5.5636245476257f);//F13
     gl.glEnd();
     
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(7.2572567819747f,5.0932847260874f);//M11
     gl.glVertex2f(7.5325122572522f,4.6579929292802f);//B12
     gl.glVertex2f(8.0631671009201f,5.0607220517067f);//C12
     gl.glVertex2f(9.6598696215997f,5.8709182862355f);//D12
     gl.glVertex2f(10.1052406511067f,5.8803942655867f);//E12
     gl.glVertex2f(10.3231881761847f,5.8993462242892f);//F12
     gl.glVertex2f(10.3847820419675f,5.8567043172087f);//G12
     gl.glVertex2f(10.560087659965f,5.8377523585063f);//H12
     gl.glVertex2f(10.6212101454907f,5.8608577118545f);//I12
     gl.glVertex2f(10.5618518173f,5.9468249457858f);//J12
     gl.glVertex2f(10.3469337324715f,6.0860099911985f);//K12
     gl.glVertex2f(10.16271823119f,6.1208062525517f);//L12
     gl.glVertex2f(10.1217814531275f,6.1515088360986f);//M12
     gl.glVertex2f(10.16271823119f,6.2149608420956f);//N12
     gl.glVertex2f(10.5047079084803f,6.5338665130385f);//O12
     gl.glVertex2f(10.7064044568091f,6.7790662384579f);//P12
     gl.glVertex2f(10.762861318566f,6.9665447727995f);//Q12
     gl.glVertex2f(10.7171581447628f,6.9934289926837f);//R12
     gl.glVertex2f(10.6391939070986f,6.9477258188805f);//S12
     gl.glVertex2f(10.1283937292985f,6.5256435666983f);//T12
     gl.glVertex2f(10.4864448305177f,7.0172272907833f);//U12
     gl.glVertex2f(10.4761599054482f,7.178357783539f);//V12
     gl.glVertex2f(10.284174637484f,6.9589460487228f);//W12
     gl.glVertex2f(10.29788787091f,7.212640867104f);//Z12
     gl.glVertex2f(10.0956176778763f,6.9589460487228f);//A13
     gl.glVertex2f(10.0990459862328f,7.1269331581914f);//B13
     gl.glVertex2f(10.0441930525287f,7.185214400252f);//C13
     gl.glVertex2f(9.7699283840084f,6.6915379969154f);//D13
     gl.glVertex2f(9.5573732659051f,6.3178523860565f);//E13
     gl.glVertex2f(7.8775021712182f,5.5636245476257f);//F13
     gl.glEnd();
    }
    
    public void brazocortomorty(GL gl)
    {
     gl.glColor3f(0.96f, 0.86f, 0.69f);
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(4.0774306579371f,1.4049677691268f);//G13
     gl.glVertex2f(4.2265394773091f,1.3870747108021f);//H13
     gl.glVertex2f(4.4493356364639f,1.286103734926f);//I13
     gl.glVertex2f(4.4345138671371f,1.1213961479176f);//H9
     gl.glVertex2f(4.4053523956754f,0.9610080548781f);//G9
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glEnd();
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(4.0980300625196f,0.3343849982404f);//J13
     gl.glVertex2f(4.3633668719826f,0.0066396654801f);//K13
     gl.glVertex2f(3.6912831185082f,0.001804530563f);//L13
     gl.glVertex2f(3.5413939360787f,0.2580666811684f);//M13
     gl.glVertex2f(3.8769247042405f,0.9552329854029f);//Z7
     gl.glVertex2f(3.9684690313443f,1.1607238416221f);//J11
     gl.glEnd();
     gl.glLineWidth(4);
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glVertex2f(4.0980300625196f,0.3343849982404f);//J13
     gl.glVertex2f(3.8769247042405f,0.9552329854029f);//Z7
     gl.glVertex2f(4.0774306579371f,1.4049677691268f);//G13
     gl.glEnd();
     
     gl.glColor3f(0f, 0f, 0f);
     gl.glLineWidth(2);
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glVertex2f(4.0774306579371f,1.4049677691268f);//G13
     gl.glVertex2f(4.2265394773091f,1.3870747108021f);//H13
     gl.glVertex2f(4.4493356364639f,1.286103734926f);//I13
     gl.glVertex2f(4.4345138671371f,1.1213961479176f);//H9
     gl.glVertex2f(4.4053523956754f,0.9610080548781f);//G9
     gl.glVertex2f(4.2743066760725f,0.6133127122048f);//Z
     gl.glVertex2f(4.0980300625196f,0.3343849982404f);//J13
     gl.glVertex2f(4.3633668719826f,0.0066396654801f);//K13
     gl.glVertex2f(3.6912831185082f,0.001804530563f);//L13
     gl.glVertex2f(3.5413939360787f,0.2580666811684f);//M13
     gl.glVertex2f(3.8769247042405f,0.9552329854029f);//Z7
     gl.glVertex2f(3.9684690313443f,1.1607238416221f);//J11
     gl.glEnd();
     
    }
    
    public void cararick(GL gl)
    {
     float calx, caly;
       //OJOS
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1f, 1f, 1f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.5033510848031 * Math.cos(i));
            caly = (float) (0.5033510848031 * Math.sin(i));
            gl.glVertex2f(calx+3.0163783214549f, caly+8.918960530165f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POINTS);
        gl.glPointSize(10);
        gl.glColor3f(0f, 0f, 0f);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.5033510848031 * Math.cos(i));
            caly = (float) (0.5033510848031 * Math.sin(i));
            gl.glVertex2f(calx+3.0163783214549f, caly+8.918960530165f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1f, 1f, 1f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.5177789154164 * Math.cos(i));
            caly = (float) (0.5177789154164 * Math.sin(i));
            gl.glVertex2f(calx+4.130248590253f, caly+8.6661083324141f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POINTS);
        gl.glPointSize(10);
        gl.glColor3f(0f, 0f, 0f);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.5177789154164 * Math.cos(i));
            caly = (float) (0.5177789154164 * Math.sin(i));
            gl.glVertex2f(calx+4.130248590253f, caly+8.6661083324141f);
        }
        gl.glEnd();
        
        //PUPILAS
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0f, 0f, 0f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.0880907244507 * Math.cos(i));
            caly = (float) (0.0880907244507 * Math.sin(i));
            gl.glVertex2f(calx+3.0982167640236f, caly+8.588218343685f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glPointSize(4);
        gl.glColor3f(0f, 0f, 0f);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.0880907244507 * Math.cos(i));
            caly = (float) (0.0880907244507 * Math.sin(i));
            gl.glVertex2f(calx+4.2240089996663f, caly+8.320767552834f);
        }
        gl.glEnd();
        
        //SONRRIZA
        
       gl.glBegin(GL.GL_LINES);
       gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.3082388521828f,8.3920762485743f);//R13
        gl.glVertex2f(3.2266344195292f,8.2696695995939f);//S13
        gl.glVertex2f(3.2266344195292f,8.2696695995939f);//S13
        gl.glVertex2f(3.1807319261615f,8.1370623965317f);//T13
        gl.glVertex2f(3.1807319261615f,8.1370623965317f);//T13
        gl.glVertex2f(3.1450299868756f,8.024856301633f);//U13
        gl.glVertex2f(3.1450299868756f,8.024856301633f);//U13
        gl.glVertex2f(3.1501302639164f,7.9126502067343f);//V13
        gl.glVertex2f(3.1501302639164f,7.9126502067343f);//V13
        gl.glVertex2f(3.2113335884066f,7.8259454970398f);//W13
        gl.glVertex2f(3.2113335884066f,7.8259454970398f);//W13
        gl.glVertex2f(3.3065021408053f,7.8595456606285f);//Z13
        gl.glVertex2f(3.3065021408053f,7.8595456606285f);//Z13
        gl.glVertex2f(3.400497513459f,7.973123402585f);//A14
        gl.glVertex2f(3.400497513459f,7.973123402585f);//A14
        gl.glVertex2f(3.5336576247184f,8.1336988308684f);//B14
        gl.glEnd();
       
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.0597642875893F,8.2394436251038F);//C14
        gl.glVertex2f(2.9187712286087F,8.2433600989644F);//D14
        gl.glVertex2f(2.9187712286087F,8.2433600989644F);//D14
        gl.glVertex2f(2.7660287480465F,8.2668589421278F);//E14
        gl.glVertex2f(2.7660287480465F,8.2668589421278F);//E14
        gl.glVertex2f(2.6524510060899F,8.3412719454787F);//F14
        gl.glVertex2f(2.6524510060899F,8.3412719454787F);//F14
        gl.glVertex2f(2.5467062118545F,8.4861814783198F);//G14
        gl.glVertex2f(2.5467062118545F,8.4861814783198F);//G14
        gl.glVertex2f(2.5036249993882F,8.5762603771129F);//H14
        gl.glVertex2f(2.5036249993882F,8.5762603771129F);//H14
        gl.glVertex2f(2.5567083460436f,8.689381676197f);//N2
        
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.7356837988917f,8.0923338316603f);//I14
        gl.glVertex2f(3.8773058982378f,8.0163414856697f);//J14
        gl.glVertex2f(3.8773058982378f,8.0163414856697f);//J14
        gl.glVertex2f(4.0500157754891f,7.9403491396791f);//K14
        gl.glVertex2f(4.0500157754891f,7.9403491396791f);//K14
        gl.glVertex2f(4.2710844183707f,7.9161697568639f);//L14
        gl.glVertex2f(4.2710844183707f,7.9161697568639f);//L14
        gl.glVertex2f(4.4f,8);//M14        
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(2.66090203299f,7.6720924847139f);//N14
        gl.glVertex2f(2.4474697603391f,7.7075916494145f);//J2
        gl.glVertex2f(2.4474697603391f,7.7075916494145f);//J2
        gl.glVertex2f(2.3620437113287f,7.687089397652f);//I2
        gl.glVertex2f(2.3620437113287f,7.687089397652f);//I2
        gl.glVertex2f(2.3381244176057f,7.5811610968791f);//H2
        gl.glVertex2f(2.3381244176057f,7.5811610968791f);//H2
        gl.glVertex2f(2.3882837053226f,7.4596771010611f);//O14
        gl.glVertex2f(2.3882837053226f,7.4596771010611f);//O14
        gl.glVertex2f(2.5194982022664f,7.3266145126111f);//P14
        gl.glVertex2f(2.5194982022664f,7.3266145126111f);//P14
        gl.glVertex2f(2.6704955507367f,7.2177059521216f);//Q14   
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.8746865608988f,7.3945408947576f);//R14
        gl.glVertex2f(4,7.4f);//S14
        gl.glVertex2f(4,7.4f);//S14
        gl.glVertex2f(4.1450989279698f,7.3327323537128f);//T14
        gl.glVertex2f(4.1450989279698f,7.3327323537128f);//T14
        gl.glVertex2f(4.2300856719063f,7.2554716774068f);//U14
        gl.glVertex2f(4.2300856719063f,7.2554716774068f);//U14
        gl.glVertex2f(4.2f,7.2f);//V14
        gl.glVertex2f(4.2f,7.2f);//V14
        gl.glVertex2f(4.1450989279698f,7.1241285276867f);//W14
        gl.glVertex2f(4.1450989279698f,7.1241285276867f);//W14
        gl.glVertex2f(4.0292079135108f,7.0584569528266f);//Z14
        gl.glVertex2f(4.0292079135108f,7.0584569528266f);//Z14
        gl.glVertex2f(3.851508358007f,7.0584569528266f);//A15 
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(2.5033095564676f,7.5876925855226f);//B15
        gl.glVertex2f(2.98618878338f,7.3327323537128f);//C15
        gl.glVertex2f(2.98618878338f,7.3327323537128f);//C15
        gl.glVertex2f(3.2720532857121f,7.2361565083303f);//D15
        gl.glVertex2f(3.2720532857121f,7.2361565083303f);//D15
        gl.glVertex2f(3.4f,7.2f);//E15
        gl.glVertex2f(3.4f,7.2f);//E15
        gl.glVertex2f(3.7317543097327f,7.2168413392538f);//F15
        gl.glVertex2f(3.7317543097327f,7.2168413392538f);//F15
        gl.glVertex2f(3.928769034313f,7.2400195421456f);//G15
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
     gl.glColor3f(0.61f, 0.95f, 0.95f);
     gl.glVertex2f(4.6729354872106f,9.2935056844751f);//L15
     gl.glVertex2f(4.6990172596106f,9.3891595692758f);//M15
     gl.glVertex2f(4.6482296643695f,9.480042634444f);//N15
     gl.glVertex2f(4.533289317245f,9.608348138211f);//O15
     gl.glVertex2f(4.2686592157257f,9.7981333625329f);//P15
     gl.glVertex2f(3.9664198892941f,9.9120300217493f);//Q15
     gl.glVertex2f(3.9192921288009f,9.7235189797764f);//D16
     gl.glVertex2f(4.2320490848014f,9.5264392540775f);//E16
     gl.glVertex2f(4.4505505198154f,9.3893403144608f);//F16
     gl.glVertex2f(4.5662277501169f,9.3122221609264f);//G16
     gl.glEnd();
     gl.glBegin(GL.GL_POLYGON);
     gl.glVertex2f(3.9192921288009f,9.7235189797764f);//D16
     gl.glVertex2f(3.9664198892941f,9.9120300217493f);//Q15
     gl.glVertex2f(3.6f,10);//R15
     gl.glVertex2f(3.3451903191562f,10.0020012008727f);//S15
     gl.glVertex2f(3.2509347981698f,9.9720108078315f);//T15
     gl.glVertex2f(3.0624237561969f,9.8777552868451f);//U15
     gl.glVertex2f(2.9638838933474f,9.8134901588998f);//V15
     gl.glVertex2f(2.9767369189365f,9.6721068774201f);//W15
     gl.glVertex2f(3.1395419097313f,9.6806755611462f);//Z15
     gl.glVertex2f(3.3237686098411f,9.7406563472285f);//A16
     gl.glVertex2f(3.5508387285812f,9.7620780565436f);//B16
     gl.glVertex2f(3.7864775310473f,9.7620780565436f);//C16
     gl.glEnd();
     
        gl.glBegin(GL.GL_LINE_LOOP);
     gl.glColor3f(0f, 0f, 0f);
     gl.glVertex2f(4.6729354872106f,9.2935056844751f);//L15
     gl.glVertex2f(4.6990172596106f,9.3891595692758f);//M15
     gl.glVertex2f(4.6482296643695f,9.480042634444f);//N15
     gl.glVertex2f(4.533289317245f,9.608348138211f);//O15
     gl.glVertex2f(4.2686592157257f,9.7981333625329f);//P15
     gl.glVertex2f(3.9664198892941f,9.9120300217493f);//Q15
     gl.glVertex2f(3.6f,10);//R15
     gl.glVertex2f(3.3451903191562f,10.0020012008727f);//S15
     gl.glVertex2f(3.2509347981698f,9.9720108078315f);//T15
     gl.glVertex2f(3.0624237561969f,9.8777552868451f);//U15
     gl.glVertex2f(2.9638838933474f,9.8134901588998f);//V15
     gl.glVertex2f(2.9767369189365f,9.6721068774201f);//W15
     gl.glVertex2f(3.1395419097313f,9.6806755611462f);//Z15
     gl.glVertex2f(3.3237686098411f,9.7406563472285f);//A16
     gl.glVertex2f(3.5508387285812f,9.7620780565436f);//B16
     gl.glVertex2f(3.7864775310473f,9.7620780565436f);//C16
     gl.glVertex2f(3.9192921288009f,9.7235189797764f);//D16
     gl.glVertex2f(4.2320490848014f,9.5264392540775f);//E16
     gl.glVertex2f(4.4505505198154f,9.3893403144608f);//F16
     gl.glVertex2f(4.5662277501169f,9.3122221609264f);//G16
     gl.glEnd();
        
    }
    
    public void caramorty(GL gl)
    {
        //OJOS
        float calx, caly;
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1f, 1f, 1f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.6028855248329 * Math.cos(i));
            caly = (float) (0.6028855248329 * Math.sin(i));
            gl.glVertex2f(calx+4.9501134642419f, caly+4.287054759093f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POINTS);
        gl.glColor3f(0f, 0f, 0f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.6028855248329 * Math.cos(i));
            caly = (float) (0.6028855248329 * Math.sin(i));
            gl.glVertex2f(calx+4.9501134642419f, caly+4.287054759093f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(1f, 1f, 1f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.56616679225332 * Math.cos(i));
            caly = (float) (0.56616679225332 * Math.sin(i));
            gl.glVertex2f(calx+6.0311609225332f, caly+5.417240738216f);
        }
        gl.glEnd();
        
         gl.glBegin(GL.GL_POINTS);
        gl.glColor3f(0f, 0f, 0f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.56616679225332 * Math.cos(i));
            caly = (float) (0.56616679225332 * Math.sin(i));
            gl.glVertex2f(calx+6.0311609225332f, caly+5.417240738216f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0f, 0f, 0f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.0891998251866 * Math.cos(i));
            caly = (float) (0.0891998251866 * Math.sin(i));
            gl.glVertex2f(calx+5.7476894901233f, caly+5.74140363954f);
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0f, 0f, 0f);
        gl.glPointSize(4);
        for(int i=0; i<360;i++)
        {
            calx = (float) (0.0891998251866 * Math.cos(i));
            caly = (float) (0.0891998251866 * Math.sin(i));
            gl.glVertex2f(calx+4.76367699245f, caly+4.716247083031f);
            
        }
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(4.174816802235f,4.4617694998278f);//L16
        gl.glVertex2f(4.4478085846318f,4.789359638704f);//M16
        gl.glVertex2f(4.4478085846318f,4.789359638704f);//M16
        gl.glVertex2f(4.5515454619426f,5.1988473122992f);//N16
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(5.1794265614552f,5.892246439587f);//O16
        gl.glVertex2f(5.4414986725561f,5.9250054534746f);//P16
        gl.glVertex2f(5.4414986725561f,5.9250054534746f);//P16
        gl.glVertex2f(5.5755333404536f,6.0766846227253f);//F11
        gl.glEnd();
    
     gl.glBegin(GL.GL_POLYGON);
     gl.glColor3f(0.61f, 0.15f, 0.08f);
     gl.glVertex2f(6.4263603891881f,3.7858169026352f);//Q16
     gl.glVertex2f(6.2936906515908f,3.6740950183427f);//R16
     gl.glVertex2f(6.1610209139935f,3.5833209873551f);//S16
     gl.glVertex2f(6.0353337941645f,3.5588818251661f);//T16
     gl.glVertex2f(5.9340858365244f,3.5693557518186f);//U16
     gl.glVertex2f(5.8886988210306f,3.6636210916903f);//V16
     gl.glVertex2f(5.8817162032623f,3.5972862228917f);//W16
     gl.glVertex2f(6,3.8f);//Z16
     gl.glVertex2f(6.1435643695728f,3.8975387869277f);//A17
     gl.glVertex2f(6.2867080338225f,4.0127519801043f);//B17
     gl.glVertex2f(6.4054125358833f,4.1698608798906f);//C17
     gl.glVertex2f(6.548556200133f,4.3583915596341f);//D17
     gl.glVertex2f(6.6253649955841f,4.3967959573597f);//E17
     gl.glVertex2f(6.6777346288462f,4.3583915596341f);//F17
     gl.glVertex2f(6.6882085554986f,4.2711088375306f);//G17
     gl.glVertex2f(6.6742433199621f,4.155895644354f);//H17
     gl.glVertex2f(6.6f,4);//I17
     gl.glEnd();
     
     gl.glBegin(GL.GL_LINE_LOOP);
     gl.glColor3f(0f, 0f, 0f);
     gl.glVertex2f(6.4263603891881f,3.7858169026352f);//Q16
     gl.glVertex2f(6.2936906515908f,3.6740950183427f);//R16
     gl.glVertex2f(6.1610209139935f,3.5833209873551f);//S16
     gl.glVertex2f(6.0353337941645f,3.5588818251661f);//T16
     gl.glVertex2f(5.9340858365244f,3.5693557518186f);//U16
     gl.glVertex2f(5.8886988210306f,3.6636210916903f);//V16
     gl.glVertex2f(5.8817162032623f,3.5972862228917f);//W16
     gl.glVertex2f(6,3.8f);//Z16
     gl.glVertex2f(6.1435643695728f,3.8975387869277f);//A17
     gl.glVertex2f(6.2867080338225f,4.0127519801043f);//B17
     gl.glVertex2f(6.4054125358833f,4.1698608798906f);//C17
     gl.glVertex2f(6.548556200133f,4.3583915596341f);//D17
     gl.glVertex2f(6.6253649955841f,4.3967959573597f);//E17
     gl.glVertex2f(6.6777346288462f,4.3583915596341f);//F17
     gl.glVertex2f(6.6882085554986f,4.2711088375306f);//G17
     gl.glVertex2f(6.6742433199621f,4.155895644354f);//H17
     gl.glVertex2f(6.6f,4);//I17
     gl.glEnd();
     
     gl.glBegin(GL.GL_LINES);
       // gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(5.8502944233051f,4.6097657992922f);//J17
        gl.glVertex2f(6.0911947363107f,4.5608874749142f);//K17
        gl.glVertex2f(6.0911947363107f,4.5608874749142f);//K17
        gl.glVertex2f(6.1784774584142f,4.5224830771887f);//L17
        gl.glVertex2f(6.1784774584142f,4.5224830771887f);//L17
        gl.glVertex2f(6.1575296051094f,4.4282177373169f);//M17
        gl.glVertex2f(6.1575296051094f,4.4282177373169f);//M17
        gl.glVertex2f(5.8921901299148f,4.2850740730672f);//N17
        gl.glEnd();
    }
    
    public void detalles(GL gl)
    {
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(0.534644120359f,3.7047045553106f);//R17
        gl.glVertex2f(0.6278804951834f,3.9628975932859f);//S17
        gl.glVertex2f(0.6278804951834f,3.9628975932859f);//S17
        gl.glVertex2f(2.4024882413658f,5.8437870176716f);//T
        gl.glVertex2f(2.4024882413658f,5.8437870176716f);//T
        gl.glVertex2f(2.599612321892f,6.032748943532f);//C1
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(2.0216724486862f,4.1954592850143f);//E
        gl.glVertex2f(2.865553490969f,5.3112390138234f);//T17
        gl.glVertex2f(2.865553490969f,5.3112390138234f);//T17
        gl.glVertex2f(2.937273779295f,5.5048837923048f);//U17
        gl.glVertex2f(2.937273779295f,5.5048837923048f);//U17
        gl.glVertex2f(2.8855770374251f,5.7461345702422f);//Z1
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.1795186531467f,2.399418922619f);//V17
        gl.glVertex2f(2.7433932661764f,3.99854534151f);//W17
        gl.glVertex2f(2.7433932661764f,3.99854534151f);//W17
        gl.glVertex2f(2.8570391450908f,4.0874402341203f);//Z17
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(2.9203471982317f,6.1862611090326f);//A18
        gl.glVertex2f(3.03648338095f,6.0410908806347f);//B18
        gl.glVertex2f(3.03648338095f,6.0410908806347f);//B18
        gl.glVertex2f(2.9203471982317f,6.0773834377342f);//C18
        gl.glVertex2f(2.9203471982317f,6.0773834377342f);//C18
        gl.glVertex2f(2.8368743169029f,6.0374616249248f);//D18
        gl.glVertex2f(2.8368743169029f,6.0374616249248f);//D18
        gl.glVertex2f(2.8114695269333f,5.953988743596f);//E18
        gl.glVertex2f(2.8114695269333f,5.953988743596f);//E18
        gl.glVertex2f(2.9699766732438f,5.7630144974059f);//W1
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.3163930114995f,6.2994533655215f);//F18
        gl.glVertex2f(3.3217188962391f,5.95859674219f);//G18
        gl.glVertex2f(3.3217188962391f,5.95859674219f);//G18
        gl.glVertex2f(3.1809757627907f,5.7630144974059f);//U1
        gl.glEnd();
        
         gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.6439349229821f,6.3234198468495f);//H18
        gl.glVertex2f(3.6359460958728f,5.9852261658878f);//I18
        gl.glVertex2f(3.6359460958728f,5.9852261658878f);//I18
        gl.glVertex2f(3.4172947430832f,5.7461345702422f);//R1
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(3.9155550446994f,6.3420604434379f);//J18
        gl.glVertex2f(3.8862626786318f,6.0677773793509f);//K18
        gl.glVertex2f(3.8862626786318f,6.0677773793509f);//K18
        gl.glVertex2f(3.839292922177f,5.8769540057613f);//M1
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(10.284174637484f,6.9589460487228f);//W12
        gl.glVertex2f(10.2476650411274f,6.8859487578288f);//L18
        gl.glVertex2f(10.2476650411274f,6.8859487578288f);//L18
        gl.glVertex2f(10,6.6f);//M18
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(10.0956176778763f,6.9589460487228f);//A13
        gl.glVertex2f(10.0798536411554f,6.9055267544921f);//N18
        gl.glVertex2f(10.0798536411554f,6.9055267544921f);//N18
        gl.glVertex2f(9.9092453845173f,6.7237310711892f);//O18
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(4.5443897694558f,0.9438988847679f);//P18
        gl.glVertex2f(4.5252342032246f,0.7268024674809f);//Q18
        gl.glVertex2f(4.5252342032246f,0.7268024674809f);//Q18
        gl.glVertex2f(4.5424113115455f,0.5177536886598f);//B9
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(4.6837937971267f,0.8036559419422f);//R18
        gl.glVertex2f(4.684863921818f,0.6310246363248f);//S18
        gl.glVertex2f(4.684863921818f,0.6310246363248f);//S18
        gl.glVertex2f(4.7720076395106f,0.3701991290789f);//U8
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(4.8891899616176f,0.771498788687f);//T18
        gl.glVertex2f(4.9115381222207f,0.5575949657719f);//U18
        gl.glVertex2f(4.9115381222207f,0.5575949657719f);//U18
        gl.glVertex2f(5.1440899917503f,0.2974933820895f);//Q8
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINES);
        gl.glColor3f(0f, 0f, 0f);
        gl.glVertex2f(5.387868084597f,0.8534785061258f);//I8
        gl.glVertex2f(5.2653854617253f,0.7583371109346f);//V18
        gl.glVertex2f(5.2653854617253f,0.7583371109346f);//V18
        gl.glVertex2f(5.1537810562002f,0.6499574780434f);//W
        gl.glVertex2f(5.1537810562002f,0.6499574780434f);//W
        gl.glVertex2f(5.1690829458339f,0.5846149254051f);//W18
        gl.glEnd();
    }
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

