import java.awt.Rectangle;


public class Colision {
	//colision  for the squares [32 squares]
	
	public int ball11X;
	public int ball11Y;
	public int ball13X=246;
	public int ball13Y=33;
	public int ball15X=407;
	public int ball15Y=33;
	public int ball17X=560;
	public int ball17Y=33;
	
	public int ball22X=6;
	public int ball22Y=110;
	public int ball24X=166;
	public int ball24Y=110;
	public int ball26X=326;
	public int ball26Y=110;
	public int ball28X=486;
	public int ball28Y=110;
	
	public int ball31X=88;
	public int ball31Y=190;
	public int ball33X=246;
	public int ball33Y=190;
	public int ball35X=407;
	public int ball35Y=190;
	public int ball37X=560;
	public int ball37Y=190;
	
	public int ball42X;
	public int ball42Y;
	public int ball44X;
	public int ball44Y;
	public int ball46X;
	public int ball46Y;
	public int ball48X;
	public int ball48Y;
	
	public int ball51X;
	public int ball51Y;
	public int ball53X;
	public int ball53Y;
	public int ball55X;
	public int ball55Y;
	public int ball57X;
	public int ball57Y;
	
	public int ball62X;
	public int ball62Y;
	public int ball64X;
	public int ball64Y;
	public int ball66X;
	public int ball66Y;
	public int ball68X;
	public int ball68Y;
	
	public int ball71X;
	public int ball71Y;
	public int ball73X;
	public int ball73Y;
	public int ball75X;
	public int ball75Y;
	public int ball77X;
	public int ball77Y;
	
	public int ball82X;
	public int ball82Y;
	public int ball84X;
	public int ball84Y;
	public int ball86X;
	public int ball86Y;
	public int ball88X;
	public int ball88Y;
	
	public Rectangle rect11;
	public Rectangle rect13;
	public Rectangle rect15;
	public Rectangle rect17;
	
	public Rectangle rect22;
	public Rectangle rect24;
	public Rectangle rect26;
	public Rectangle rect28;
	
	public Rectangle rect31;
	public Rectangle rect33;
	public Rectangle rect35;
	public Rectangle rect37;
	
	public Rectangle rect42;
	public Rectangle rect44;
	public Rectangle rect46;
	public Rectangle rect48;
	
	public Rectangle rect51;
	public Rectangle rect53;
	public Rectangle rect55;
	public Rectangle rect57;
	
	public Rectangle rect62;
	public Rectangle rect64;
	public Rectangle rect66;
	public Rectangle rect68;
	
	public Rectangle rect71;
	public Rectangle rect73;
	public Rectangle rect75;
	public Rectangle rect77;
	
	public Rectangle rect82;
	public Rectangle rect84;
	public Rectangle rect86;
	public Rectangle rect88;
	
	//-----------------------------------------------------
	//rectangles for the checkers [24 checkers]
	public Rectangle ball11;
	public Rectangle ball13;
	public Rectangle ball15;
	public Rectangle ball17;
	
	public Rectangle ball22;
	public Rectangle ball24;
	public Rectangle ball26;
	public Rectangle ball28;
	
	public Rectangle ball31;
	public Rectangle ball33;
	public Rectangle ball35;
	public Rectangle ball37;
	
	//================================
	public Rectangle ball42;
	public Rectangle ball44;
	public Rectangle ball46;
	public Rectangle ball48;
	
	public Rectangle ball51;
	public Rectangle ball53;
	public Rectangle ball55;
	public Rectangle ball57;
	//================================
	
	public Rectangle ball61;
	public Rectangle ball63;
	public Rectangle ball65;
	public Rectangle ball67;
	
	public Rectangle ball72;
	public Rectangle ball74;
	public Rectangle ball76;
	public Rectangle ball78;
	
	public Rectangle ball81;
	public Rectangle ball83;
	public Rectangle ball85;
	public Rectangle ball87;
	
	
	
	public Colision(){
		ball11X=88;
		ball11Y=33;
		//squares
		rect11 = new Rectangle(82,26,80,80);
		rect13 = new Rectangle(242,26,80,80);
		rect15 = new Rectangle(402,26,80,80);
		rect17 = new Rectangle(562,26,80,80);
		
		rect22 = new Rectangle(2,106,80,80);
		rect24 = new Rectangle(162,106,80,80);
		rect26 = new Rectangle(322,106,80,80);
		rect28 = new Rectangle(482,106,80,80);
		
		rect31 = new Rectangle(82,186,80,80);
		rect33 = new Rectangle(242,186,80,80);
		rect35 = new Rectangle(402,186,80,80);
		rect37 = new Rectangle(562,186,80,80);
		
		rect42 = new Rectangle(2,266,80,80);
		rect44 = new Rectangle(162,266,80,80);
		rect46 = new Rectangle(322,266,80,80);
		rect48 = new Rectangle(482,266,80,80);
		
		rect51 = new Rectangle(82,346,80,80);
		rect53 = new Rectangle(242,346,80,80);
		rect55 = new Rectangle(402,346,80,80);
		rect57 = new Rectangle(562,346,80,80);
		
		rect62 = new Rectangle(2,426,80,80);
		rect64 = new Rectangle(162,426,80,80);
		rect66 = new Rectangle(322,426,80,80);
		rect68 = new Rectangle(482,426,80,80);
		
		rect71 = new Rectangle(82,506,80,80);
		rect73 = new Rectangle(242,506,80,80);
		rect75 = new Rectangle(402,506,80,80);
		rect77 = new Rectangle(562,506,80,80);
		
		rect82 = new Rectangle(2,586,80,80);
		rect84 = new Rectangle(162,586,80,80);
		rect86 = new Rectangle(322,586,80,80);
		rect88 = new Rectangle(482,586,80,80);
		
		//all the squares are now covered.
		
		ball11 = new Rectangle(ball11X,ball11Y,69,69);
		ball13 = new Rectangle(ball13X,ball13Y,69,69);
		ball15 = new Rectangle(ball15X,ball15Y,69,69);
		ball17 = new Rectangle(ball17X,ball17Y,69,69);
		
		ball22 = new Rectangle(ball22X,ball22Y,69,69);
		ball24 = new Rectangle(ball24X,ball24Y,69,69);
		ball26 = new Rectangle(ball26X,ball26Y,69,69);
		ball28 = new Rectangle(ball28X,ball28Y,69,69);
		
		ball31 = new Rectangle(ball31X,ball31Y,69,69);
		ball33 = new Rectangle(ball33X,ball33Y,69,69);
		ball35 = new Rectangle(ball35X,ball35Y,69,69);
		ball37 = new Rectangle(ball37X,ball37Y,69,69);
		
		//=======================================
		
		ball42 = new Rectangle(2,266,69,69);
		ball44 = new Rectangle(162,266,69,69);
		ball46 = new Rectangle(322,266,69,69);
		ball48 = new Rectangle(482,266,69,69);
		
		ball51 = new Rectangle(82,346,69,69);
		ball53 = new Rectangle(242,346,69,69);
		ball55 = new Rectangle(402,346,69,69);
		ball57 = new Rectangle(562,346,69,69);
		
		//=======================================
		
		ball61 = new Rectangle(ball62X,ball62Y,69,69);
		ball63 = new Rectangle(ball64X,ball64Y,69,69);
		ball65 = new Rectangle(ball66X,ball66Y,69,69);
		ball67 = new Rectangle(ball68X,ball68Y,69,69);
		
		ball72 = new Rectangle(ball71X,ball71Y,69,69);
		ball74 = new Rectangle(ball73X,ball73Y,69,69);
		ball76 = new Rectangle(ball75X,ball75Y,69,69);
		ball78 = new Rectangle(ball77X,ball77Y,69,69);
		
		ball81 = new Rectangle(ball82X,ball82Y,69,69);
		ball83 = new Rectangle(ball84X,ball84Y,69,69);
		ball85 = new Rectangle(ball86X,ball86Y,69,69);
		ball87 = new Rectangle(ball88X,ball88Y,69,69);
	}

}
