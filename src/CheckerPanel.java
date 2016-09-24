import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;


public class CheckerPanel extends JPanel implements MouseMotionListener, MouseListener{
	
	private static final long serialVersionUID = 1L;

	public Checker checker;
	public Colision col;
	
	boolean highlight11=false;
	boolean highlight12=false;
	boolean highlight13=false;
	boolean highlight14=false;
	
	boolean highlight21=false;
	boolean highlight22=false;
	boolean highlight23=false;
	boolean highlight24=false;
	
	boolean highlight31=false;
	boolean highlight32=false;
	boolean highlight33=false;
	boolean highlight34=false;
	
	boolean highlight41=false;
	boolean highlight42=false;
	boolean highlight43=false;
	boolean highlight44=false;
	
	boolean highlight51=false;
	boolean highlight52=false;
	boolean highlight53=false;
	boolean highlight54=false;
	
	boolean highlight61=false;
	boolean highlight62=false;
	boolean highlight63=false;
	boolean highlight64=false;
	
	boolean highlight71=false;
	boolean highlight72=false;
	boolean highlight73=false;
	boolean highlight74=false;
	
	boolean highlight81=false;
	boolean highlight82=false;
	boolean highlight83=false;
	boolean highlight84=false;
	
	boolean square11=false;
	boolean square12=false;
	boolean square13=false;
	boolean square14=false;
	
	boolean square21=false;
	boolean square22=false;
	boolean square23=false;
	boolean square24=false;
	
	boolean square31=false;
	boolean square32=false;
	boolean square33=false;
	boolean square34=false;
	
	
	
	boolean square61=false;
	boolean square62=false;
	boolean square63=false;
	boolean square64=false;
	
	boolean square71=false;
	boolean square72=false;
	boolean square73=false;
	boolean square74=false;
	
	boolean square81=false;
	boolean square82=false;
	boolean square83=false;
	boolean square84=false;
	public int X11=87; public boolean moved11= false;
	public int Y11=33;
	public int X12=246;
	public int Y12=33;
	public int X13=407;
	public int Y13=33;
	public int X14=566;
	public int Y14=33;
	
	public int X21=6;
	public int Y21=110;
	public int X22=166;
	public int Y22=110;
	public int X23=327;
	public int Y23=110;
	public int X24=487;
	public int Y24=110;
	
	public int X31=88;
	public int Y31=190;
	public int X32=246;
	public int Y32=190;
	public int X33=407;
	public int Y33=190;
	public int X34=566;
	public int Y34=190;
	//========================================
	public int X41=6;
	public int Y41=270;
	public int X42=166;
	public int Y42=270;
	public int X43=327;
	public int Y43=270;
	public int X44=487;
	public int Y44=270;
	
	public int X51=6;
	public int Y51=350;
	public int X52=166;
	public int Y52=350;
	public int X53=327;
	public int Y53=350;
	public int X54=487;
	public int Y54=350;
	//=========================================
	public int X61=6;
	public int Y61=430;
	public int X62=166;
	public int Y62=430;
	public int X63=327;
	public int Y63=430;
	public int X64=487;
	public int Y64=430;
	
	public int X71=88;
	public int Y71=510;
	public int X72=246;
	public int Y72=510;
	public int X73=407;
	public int Y73=510;
	public int X74=566;
	public int Y74=510;
	
	public int X81=6;
	public int Y81=590;
	public int X82=166;
	public int Y82=590;
	public int X83=327;
	public int Y83=590;
	public int X84=487;
	public int Y84=590;

	public CheckerPanel(){
		checker = new Checker();
		col = new Colision();
		checker.white11X=X11;  checker.white11Y=Y11;
		col.ball11X=X11; col.ball11Y=Y11;
		checker.white12X=X12; checker.white12Y=Y12;
		col.ball13X=X12; col.ball13Y=Y12;
		checker.white13X=X13; checker.white13Y=Y13;
		col.ball15X=X13; col.ball15Y=Y13;
		checker.white14X=X14; checker.white14Y=Y14;
		col.ball17X=X14; col.ball17Y=Y14;
		
		checker.white21X=X21;  checker.white21Y=Y21;
		col.ball22X=X21; col.ball22Y=Y21;
		checker.white22X=X22; checker.white22Y=Y22;
		col.ball24X=X22; col.ball24Y=Y22;
		checker.white23X=X23; checker.white23Y=Y23;
		col.ball26X=X23; col.ball26Y=Y23;
		checker.white24X=X24; checker.white24Y=Y24;
		col.ball28X=X24; col.ball28Y=Y24;
		
		checker.white31X=X31;  checker.white31Y=Y31;
		col.ball31X=X31; col.ball31Y=Y31;
		checker.white32X=X32; checker.white32Y=Y32;
		col.ball33X=X32; col.ball33Y=Y32;
		checker.white33X=X33; checker.white33Y=Y33;
		col.ball35X=X33; col.ball35Y=Y33;
		checker.white34X=X34; checker.white34Y=Y34;
		col.ball37X=X34; col.ball37Y=Y34;
		
		checker.blue11X=X61;  checker.blue11Y=Y61;//430
		col.ball62X=X61; col.ball62Y=Y61;
		checker.blue12X=X62; checker.blue12Y=Y62;
		col.ball64X=X62; col.ball64Y=Y62;
		checker.blue13X=X63; checker.blue13Y=Y63;
		col.ball66X=X63; col.ball66Y=Y63;
		checker.blue14X=X64; checker.blue14Y=Y64;
		col.ball68X=X64; col.ball68Y=Y64;
		
		checker.blue21X=X71;  checker.blue21Y=Y71;
		col.ball71X=X71; col.ball71Y=Y71;
		checker.blue22X=X72; checker.blue22Y=Y72;
		col.ball73X=X72; col.ball73Y=Y72;
		checker.blue23X=X73; checker.blue23Y=Y73;
		col.ball75X=X73; col.ball75Y=Y73;
		checker.blue24X=X74; checker.blue24Y=Y74;
		col.ball77X=X74; col.ball77Y=Y74;
		
		checker.blue31X=X81;  checker.blue31Y=Y81;
		col.ball82X=X81; col.ball82Y=Y81;
		checker.blue32X=X82; checker.blue32Y=Y82;
		col.ball84X=X82; col.ball84Y=Y82;
		checker.blue33X=X83; checker.blue33Y=Y83;
		col.ball86X=X83; col.ball86Y=Y83;
		checker.blue34X=X84; checker.blue34Y=Y84;
		col.ball88X=X84; col.ball88Y=Y84;
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public void paint(Graphics g){
		
		
		//=================================
		g.setColor(Color.black);
		g.fillRect(0, 0, 660, 700);
		g.setColor(Color.lightGray);
		g.fillRect(660, 0, 700, 700);		
		g.setColor(Color.yellow);
		g.fillRect(2, 26, 80, 80);
		g.fillRect(162, 26, 80, 80);
		g.fillRect(322, 26, 80, 80);
		g.fillRect(482, 26, 80, 80);
		
		
		g.fillRect(82, 106, 80, 80);
		g.fillRect(242, 106, 80, 80);
		g.fillRect(402, 106, 80, 80);
		g.fillRect(562, 106, 80, 80);
		
		g.fillRect(2, 186, 80, 80);
		g.fillRect(162, 186, 80, 80);
		g.fillRect(322, 186, 80, 80);
		g.fillRect(482, 186, 80, 80);
		
		g.fillRect(82, 266, 80, 80);
		g.fillRect(242, 266, 80, 80);
		g.fillRect(402, 266, 80, 80);
		g.fillRect(562, 266, 80, 80);
		
		g.fillRect(2, 346, 80, 80);
		g.fillRect(162, 346, 80, 80);
		g.fillRect(322, 346, 80, 80);
		g.fillRect(482, 346, 80, 80);
		
		g.fillRect(82, 426, 80, 80);
		g.fillRect(242, 426, 80, 80);
		g.fillRect(402, 426, 80, 80);
		g.fillRect(562, 426, 80, 80);
		
		g.fillRect(2, 506, 80, 80);
		g.fillRect(162, 506, 80, 80);
		g.fillRect(322, 506, 80, 80);
		g.fillRect(482, 506, 80, 80);
		
		g.fillRect(82, 586, 80, 80);
		g.fillRect(242, 586, 80, 80);
		g.fillRect(402, 586, 80, 80);
		g.fillRect(562, 586, 80, 80);
		//=====================================
		g.setColor(Color.blue);
		checker.checkerBlue11(g);
		checker.checkerBlue12(g);
		checker.checkerBlue13(g);
		checker.checkerBlue14(g);
		checker.checkerBlue21(g);
		checker.checkerBlue22(g);
		checker.checkerBlue23(g);
		checker.checkerBlue24(g);
		checker.checkerBlue31(g);
		checker.checkerBlue32(g);
		checker.checkerBlue33(g);
		checker.checkerBlue34(g);
		
		g.setColor(Color.red);
		checker.checkerWhite11(g);
		checker.checkerWhite12(g);
		checker.checkerWhite13(g);
		checker.checkerWhite14(g);
		checker.checkerWhite21(g);
		checker.checkerWhite22(g);
		checker.checkerWhite23(g);
		checker.checkerWhite24(g);
		checker.checkerWhite31(g);
		checker.checkerWhite32(g);
		checker.checkerWhite33(g);
		checker.checkerWhite34(g);
		
		repaint();
		g.dispose();
		this.setSize(860,680);
		

	
	}
        /*
         * (non-Javadoc)
         * 
         * if mouse clicks on a square a boolean for the square turns true. this allows the mouse drag to access the movement
         * for that square whilst the others squares are false. dragging the checker on that square around the board. when the 
         * mouse is released the boolean turns false, stopping the checker from moving and making it permanent, if regal checks will be carried out.
         * if not regal checker returns to original square, and play still has to make their move.
         * 
         * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
         */
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(square11 == true){
			X11=e.getX()-34;
			Y11=e.getY()-34;
			col.ball11X=X11;
			col.ball11Y=Y11;
			checker.white11X=X11;
			checker.white11Y=Y11;	
		}
		
		if(square12 == true){
			X12=e.getX()-34;
			Y12=e.getY()-34;
			col.ball13X=X12;
			col.ball13Y=Y12;
			checker.white12X=X12;
			checker.white12Y=Y12;		
		}
		if(square13 == true){
			X13=e.getX()-34;
			Y13=e.getY()-34;
			col.ball15X=X13;
			col.ball15Y=Y13;
			checker.white13X=X13;
			checker.white13Y=Y13;		
		}
		if(square14 == true){
			X14=e.getX()-34;
			Y14=e.getY()-34;
			col.ball17X=X14;
			col.ball17Y=Y14;
			checker.white14X=X14;
			checker.white14Y=Y14;		
		}
		//=============================
		if(square21 == true){
			X21=e.getX()-34;
			Y21=e.getY()-34;
			col.ball22X=X21;
			col.ball22Y=Y21;
			checker.white21X=X21;
			checker.white21Y=Y21;		
		}
		if(square22 == true){
			X22=e.getX()-34;
			Y22=e.getY()-34;
			col.ball24X=X22;
			col.ball24Y=Y22;
			checker.white22X=X22;
			checker.white22Y=Y22;		
		}
		if(square23 == true){
			X23=e.getX()-34;
			Y23=e.getY()-34;
			col.ball26X=X23;
			col.ball26Y=Y23;
			checker.white23X=X23;
			checker.white23Y=Y23;		
		}
		if(square24 == true){
			X24=e.getX()-34;
			Y24=e.getY()-34;
			col.ball28X=X24;
			col.ball28Y=Y24;
			checker.white24X=X24;
			checker.white24Y=Y24;		
		}
		//=============================
		if(square31 == true){
			X31=e.getX()-34;
			Y31=e.getY()-34;
			col.ball31X=X31;
			col.ball31Y=Y31;
			checker.white31X=X31;
			checker.white31Y=Y31;		
		}
		if(square32 == true){
			X32=e.getX()-34;
			Y32=e.getY()-34;
			col.ball33X=X32;
			col.ball33Y=Y32;
			checker.white32X=X32;
			checker.white32Y=Y32;		
		}
		if(square33 == true){
			X33=e.getX()-34;
			Y33=e.getY()-34;
			col.ball35X=X33;
			col.ball35Y=Y33;
			checker.white33X=X33;
			checker.white33Y=Y33;		
		}
		if(square34 == true){
			X34=e.getX()-34;
			Y34=e.getY()-34;
			col.ball37X=X34;
			col.ball37Y=Y34;
			checker.white34X=X34;
			checker.white34Y=Y34;		
		}
		//===================================================================================================================
		if(square61 == true){
			X61=e.getX()-34;
			Y61=e.getY()-34;
			col.ball62X=X61;
			col.ball62Y=Y61;
			checker.blue11X=X61;
			checker.blue11Y=Y61;	
		}
		
		if(square62 == true){
			X62=e.getX()-34;
			Y62=e.getY()-34;
			col.ball64X=X62;
			col.ball64Y=Y62;
			checker.blue12X=X62;
			checker.blue12Y=Y62;		
		}
		if(square63 == true){
			X63=e.getX()-34;
			Y63=e.getY()-34;
			col.ball66X=X63;
			col.ball66Y=Y63;
			checker.blue13X=X63;
			checker.blue13Y=Y63;		
		}
		if(square64 == true){
			X64=e.getX()-34;
			Y64=e.getY()-34;
			col.ball68X=X64;
			col.ball68Y=Y64;
			checker.blue14X=X64;
			checker.blue14Y=Y64;		
		}
		//=============================
		if(square71 == true){
			X71=e.getX()-34;
			Y71=e.getY()-34;
			col.ball71X=X71;
			col.ball71Y=Y71;
			checker.blue21X=X71;
			checker.blue21Y=Y71;		
		}
		if(square72 == true){
			X72=e.getX()-34;
			Y72=e.getY()-34;
			col.ball73X=X72;
			col.ball73Y=Y72;
			checker.blue22X=X72;
			checker.blue22Y=Y72;		
		}
		if(square73 == true){
			X73=e.getX()-34;
			Y73=e.getY()-34;
			col.ball75X=X73;
			col.ball75Y=Y73;
			checker.blue23X=X73;
			checker.blue23Y=Y73;		
		}
		if(square74 == true){
			X74=e.getX()-34;
			Y74=e.getY()-34;
			col.ball77X=X74;
			col.ball77Y=Y74;
			checker.blue24X=X74;
			checker.blue24Y=Y74;		
		}
		//=============================
		if(square81 == true){
			X81=e.getX()-34;
			Y81=e.getY()-34;
			col.ball82X=X81;
			col.ball82Y=Y81;
			checker.blue31X=X81;
			checker.blue31Y=Y81;		
		}
		if(square82 == true){
			X82=e.getX()-34;
			Y82=e.getY()-34;
			col.ball84X=X82;
			col.ball84Y=Y82;
			checker.blue32X=X82;
			checker.blue32Y=Y82;		
		}
		if(square83 == true){
			X83=e.getX()-34;
			Y83=e.getY()-34;
			col.ball86X=X83;
			col.ball86Y=Y83;
			checker.blue33X=X83;
			checker.blue33Y=Y83;		
		}
		if(square84 == true){
			X84=e.getX()-34;
			Y84=e.getY()-34;
			col.ball88X=X84;
			col.ball88Y=Y84;
			checker.blue34X=X84;
			checker.blue34Y=Y84;		
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("  mouse clicked white11X     "+checker.white11X);
		System.out.println("  mouse cliked white11Y      "+checker.white11Y);
		System.out.println("  mouse cliked ball11X       "+col.ball11X);
		System.out.println("  mouse cliked ball11Y       "+col.ball11Y);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>col.ball11X&& e.getX()<col.ball11X+col.ball11.width&&e.getY()>col.ball11Y&&e.getY()<col.ball11Y+col.ball11.height){
			square11=true;	
			highlight11=true;
			}
		if(e.getX()>col.rect11.x&& e.getX()<col.rect11.x+col.rect11.width&&e.getY()>col.rect11.y&&e.getY()<col.rect11.y+col.rect11.height){
			
		}
		if(e.getX()>col.ball13X&& e.getX()<col.ball13X+col.ball13.width&&e.getY()>col.ball13Y&&e.getY()<col.ball13Y+col.ball13.height){
			square12=true;
			System.out.println(" pressed "+square12);
			}
		if(e.getX()>col.rect13.x&& e.getX()<col.rect13.x+col.rect13.width&&e.getY()>col.rect13.y&&e.getY()<col.rect13.y+col.rect13.height){
			
		}
		if(e.getX()>col.ball15X&& e.getX()<col.ball15X+col.ball15.width&&e.getY()>col.ball15Y&&e.getY()<col.ball15Y+col.ball15.height){
			square13=true;
			System.out.println(" pressed "+square13);
			}
		if(e.getX()>col.rect15.x&& e.getX()<col.rect15.x+col.rect15.width&&e.getY()>col.rect15.y&&e.getY()<col.rect15.y+col.rect15.height){
			
		}
		if(e.getX()>col.ball17X&& e.getX()<col.ball17X+col.ball17.width&&e.getY()>col.ball17Y&&e.getY()<col.ball17Y+col.ball17.height){
			square14=true;
			System.out.println(" pressed "+square14);
			}
		if(e.getX()>col.rect17.x&& e.getX()<col.rect17.x+col.rect17.width&&e.getY()>col.rect17.y&&e.getY()<col.rect17.y+col.rect17.height){
			
		}
		//===============================
		if(e.getX()>col.ball22X&& e.getX()<col.ball22X+col.ball22.width&&e.getY()>col.ball22Y&&e.getY()<col.ball22Y+col.ball22.height){
			square21=true;
			System.out.println(" pressed "+square21);
			}
		if(e.getX()>col.ball24X&& e.getX()<col.ball24X+col.ball24.width&&e.getY()>col.ball24Y&&e.getY()<col.ball24Y+col.ball24.height){
			square22=true;
			System.out.println(" pressed "+square22);
			}
		if(e.getX()>col.ball26X&& e.getX()<col.ball26X+col.ball26.width&&e.getY()>col.ball26Y&&e.getY()<col.ball26Y+col.ball26.height){
			square23=true;
			System.out.println(" pressed "+square23);
			}
		if(e.getX()>col.ball28X&& e.getX()<col.ball28X+col.ball28.width&&e.getY()>col.ball28Y&&e.getY()<col.ball28Y+col.ball28.height){
			square24=true;
			System.out.println(" pressed "+square24);
			}
		//===============================
				if(e.getX()>col.ball31X&& e.getX()<col.ball31X+col.ball31.width&&e.getY()>col.ball31Y&&e.getY()<col.ball31Y+col.ball31.height){
					square31=true;
					System.out.println(" pressed "+square21);
					}
				if(e.getX()>col.ball33X&& e.getX()<col.ball33X+col.ball33.width&&e.getY()>col.ball33Y&&e.getY()<col.ball33Y+col.ball33.height){
					square32=true;
					System.out.println(" pressed "+square22);
					}
				if(e.getX()>col.ball35X&& e.getX()<col.ball35X+col.ball35.width&&e.getY()>col.ball35Y&&e.getY()<col.ball35Y+col.ball35.height){
					square33=true;
					System.out.println(" pressed "+square23);
					}
				if(e.getX()>col.ball37X&& e.getX()<col.ball37X+col.ball37.width&&e.getY()>col.ball37Y&&e.getY()<col.ball37Y+col.ball37.height){
					square34=true;
					System.out.println(" pressed "+square24);
					}
				//========================================================================================row 7
				if(e.getX()>col.ball71X&& e.getX()<col.ball71X+col.ball72.width&&e.getY()>col.ball71Y&&e.getY()<col.ball71Y+col.ball72.height){
					square71=true;
					System.out.println(" pressed "+square11+ " ball11 x  "+col.ball11.y);
					
					}
				if(e.getX()>col.ball73X&& e.getX()<col.ball73X+col.ball74.width&&e.getY()>col.ball73Y&&e.getY()<col.ball73Y+col.ball74.height){
					square72=true;
					System.out.println(" pressed "+square12);
					}
				if(e.getX()>col.ball75X&& e.getX()<col.ball75X+col.ball76.width&&e.getY()>col.ball75Y&&e.getY()<col.ball75Y+col.ball76.height){
					square73=true;
					System.out.println(" pressed "+square13);
					}
				if(e.getX()>col.ball77X&& e.getX()<col.ball77X+col.ball78.width&&e.getY()>col.ball77Y&&e.getY()<col.ball77Y+col.ball78.height){
					square74=true;
					System.out.println(" pressed "+square14);
					}
				//===============================row 8
				if(e.getX()>col.ball82X&& e.getX()<col.ball82X+col.ball81.width&&e.getY()>col.ball82Y&&e.getY()<col.ball82Y+col.ball81.height){
					square81=true;
					System.out.println(" pressed "+square21);
					}
				if(e.getX()>col.ball84X&& e.getX()<col.ball84X+col.ball83.width&&e.getY()>col.ball84Y&&e.getY()<col.ball84Y+col.ball83.height){
					square82=true;
					System.out.println(" pressed "+square22);
					}
				if(e.getX()>col.ball86X&& e.getX()<col.ball86X+col.ball85.width&&e.getY()>col.ball86Y&&e.getY()<col.ball86Y+col.ball85.height){
					square83=true;
					System.out.println(" pressed "+square23);
					}
				if(e.getX()>col.ball88X&& e.getX()<col.ball88X+col.ball87.width&&e.getY()>col.ball88Y&&e.getY()<col.ball88Y+col.ball87.height){
					square84=true;
					System.out.println(" pressed "+square24);
					}
				//===============================row 6
						if(e.getX()>col.ball62X&& e.getX()<col.ball62X+col.ball61.width&&e.getY()>col.ball62Y&&e.getY()<col.ball62Y+col.ball61.height){
							square61=true;
							System.out.println(" pressed "+square21);
							}
						if(e.getX()>col.ball64X&& e.getX()<col.ball64X+col.ball63.width&&e.getY()>col.ball64Y&&e.getY()<col.ball64Y+col.ball63.height){
							square62=true;
							System.out.println(" pressed "+square22);					}
						if(e.getX()>col.ball66X&& e.getX()<col.ball66X+col.ball65.width&&e.getY()>col.ball66Y&&e.getY()<col.ball66Y+col.ball65.height){
							square63=true;
							System.out.println(" pressed "+square23);
							}
						if(e.getX()>col.ball68X&& e.getX()<col.ball68X+col.ball87.width&&e.getY()>col.ball68Y&&e.getY()<col.ball68Y+col.ball87.height){
							square64=true;
							System.out.println(" pressed "+square24);
							}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
			highlight11=false;

		square11=false;
		square12=false;
		square13=false;
		square14=false;
		
		square21=false;
		square22=false;
		square23=false;
		square24=false;
		
		square31=false;
		square32=false;
		square33=false;
		square34=false;
		
		square61=false;
		square62=false;
		square63=false;
		square64=false;
		
		square71=false;
		square72=false;
		square73=false;
		square74=false;
		
		square81=false;
		square82=false;
		square83=false;
		square84=false;
		System.out.println(" released "+square11);
	}
	
	

}
