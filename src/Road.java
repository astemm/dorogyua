import java.lang.Math;
import java.util.*; 

public class Road implements Comparable<Road>
{
    int nom;
    City City1;
    City City2; 

    Road(int nom, City City1, City City2)
    {
        this.nom=nom;
        this.City1=City1;
        this.City2=City2;
    }
    
    public double getDistance() {
    double shyr=((this.City1.x-this.City2.x)*111.3);
    double dov=((this.City1.y-this.City2.y)*74.2);
    return Math.sqrt(Math.pow(shyr,2.0)+Math.pow(dov,2.0));
    }

    @Override
    public int compareTo(Road o) {
        Road e1 = (Road)o;
        if(e1.getDistance()==this.getDistance())
            return 0;
        return e1.getDistance() < this.getDistance() ? 1 : -1;
    }

    @Override
    public String toString()
    {
    return String.format(this.City1.name,this.City2.name);
    }
  } 