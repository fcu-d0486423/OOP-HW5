package fcu.iecs.oop.pokemon;


public class Pokemon {

		// TODO Auto-generated method stub
		  private String name;
		  private int cp;
		  
		  public Pokemon(String name, int cp) {
		    this.name = name;
		    this.cp = cp;
		  }
		  
		  public String Name() {
		    return name;
		  }
		  
		  public int CPf() {
			    return cp;
		  }
		  
		  public void CP() {
		    System.out.println("CP: " +this.cp);
		  }
	}

