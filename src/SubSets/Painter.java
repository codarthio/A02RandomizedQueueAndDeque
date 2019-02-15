    /***************************************************************************
     * CSIS 2430 - Discrete Mathematics
     * Section 402
     * Programming Project 1
     * Authors: Cody Henry, Bradley Rohbock, and Daniel Longman
     * Discrete Mathematics and its Applications: Page 189 - Computer Project 1
     ***************************************************************************/

package SubSets;

/**
 *
 * @author Cody henry
 */

public class Painter {
    String name;
    int year;
    String period;
   
    public Painter(String n, int y){
       this.name = n;
       this.year = y;
       setPeriod();
    }
    public String getPeriod(){
        return period;
        
    }
    @Override
    public String toString(){
        return "Painter: " + this.name + " Born: (" + this.year + ") Period: " + this.period;
    }
    public void setPeriod(){
        int y = this.year;
        if(y < 1500) period = "Renaissance";
        else if(y >= 1500 && y < 1700) period = "Baroque";
        else period = "Rococo";
    }
}
