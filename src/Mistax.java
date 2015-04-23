import java.io.*;
import java.util.*;
import java.util.Map;
public class Mistax {
static Vector<City> m = new Vector<City>();
Vector<String> Names=new Vector<String>();
Map<String,City> mapp=new HashMap<String,City>();
static List<Road> edges=new ArrayList<Road>();
static String fname;
static List<Road> mst=new ArrayList<Road>();
public void mista ()throws IOException { 
try {   String fname;
        fname = "D:\\ucities.txt";
        FileReader fr = new FileReader(fname);
        BufferedReader in = new BufferedReader(fr);
        int i=1;
        String s;
        while ((s = in.readLine())!=null) {
        String[] arr=s.split(" ");
        m.add(new City(i++,arr[0],Double.parseDouble(arr[1]),Double.parseDouble(arr[2])));
        }
        }        
        catch (IOException e) {e.printStackTrace();}
        }
         
 public void citynames () throws Exception  {
         try{
        for (int j=0; j<m.size();j++)
        {Names.add(m.get(j).name);} 
        }
        catch (Exception e){e.printStackTrace();}
 }  
 
 public void createmapp () {
 for (int j=0; j<m.size();j++){
 mapp.put(Names.get(j),m.get(j));
 } 
 }  
 
public void createdges () {
Mistax g=new Mistax();
try { g.mista();
g.citynames ();
g.createmapp ();}
catch (Exception e) {e.printStackTrace();}
int i=1;
edges.add(new Road(i++,g.mapp.get("Lutsk"),g.mapp.get("Rivne")));
edges.add(new Road(i++,g.mapp.get("Lutsk"),g.mapp.get("Lviv")));
edges.add(new Road(i++,g.mapp.get("Lviv"),g.mapp.get("Rivne")));
edges.add(new Road(i++,g.mapp.get("Ternopil"),g.mapp.get("Rivne")));
edges.add(new Road(i++,g.mapp.get("Rivne"),g.mapp.get("Khmelnyskyi")));
edges.add(new Road(i++,g.mapp.get("Rivne"),g.mapp.get("Zhytomyr")));
edges.add(new Road(i++,g.mapp.get("Lviv"),g.mapp.get("Uzhgorod")));
edges.add(new Road(i++,g.mapp.get("Lviv"),g.mapp.get("IvanoFrankivsk")));
edges.add(new Road(i++,g.mapp.get("Lviv"),g.mapp.get("Ternopil")));
edges.add(new Road(i++,g.mapp.get("IvanoFrankivsk"),g.mapp.get("Ternopil")));
edges.add(new Road(i++,g.mapp.get("Uzhgorod"),g.mapp.get("IvanoFrankivsk")));
edges.add(new Road(i++,g.mapp.get("Uzhgorod"),g.mapp.get("Chernivtsi")));
edges.add(new Road(i++,g.mapp.get("IvanoFrankivsk"),g.mapp.get("Chernivtsi")));
edges.add(new Road(i++,g.mapp.get("Ternopil"),g.mapp.get("Chernivtsi")));
edges.add(new Road(i++,g.mapp.get("Chernivtsi"),g.mapp.get("Khmelnyskyi")));
edges.add(new Road(i++,g.mapp.get("Chernivtsi"),g.mapp.get("Vinnytsya")));
edges.add(new Road(i++,g.mapp.get("Ternopil"),g.mapp.get("Khmelnyskyi")));
edges.add(new Road(i++,g.mapp.get("Khmelnyskyi"),g.mapp.get("Zhytomyr")));
edges.add(new Road(i++,g.mapp.get("Zhytomyr"),g.mapp.get("Kyiv")));
edges.add(new Road(i++,g.mapp.get("Khmelnyskyi"),g.mapp.get("Vinnytsya")));
edges.add(new Road(i++,g.mapp.get("Vinnytsya"),g.mapp.get("Kyiv")));
edges.add(new Road(i++,g.mapp.get("Vinnytsya"),g.mapp.get("Cherkassy")));
edges.add(new Road(i++,g.mapp.get("Vinnytsya"),g.mapp.get("Kirovograd")));
edges.add(new Road(i++,g.mapp.get("Vinnytsya"),g.mapp.get("Odesa")));
edges.add(new Road(i++,g.mapp.get("Kyiv"),g.mapp.get("Cherkassy")));
edges.add(new Road(i++,g.mapp.get("Kyiv"),g.mapp.get("Poltava"))); 
edges.add(new Road(i++,g.mapp.get("Kyiv"),g.mapp.get("Chernigiv")));
edges.add(new Road(i++,g.mapp.get("Chernigiv"),g.mapp.get("Sumy")));
edges.add(new Road(i++,g.mapp.get("Chernigiv"),g.mapp.get("Poltava")));
edges.add(new Road(i++,g.mapp.get("Sumy"),g.mapp.get("Poltava")));
edges.add(new Road(i++,g.mapp.get("Sumy"),g.mapp.get("Kharkiv")));
edges.add(new Road(i++,g.mapp.get("Poltava"),g.mapp.get("Kharkiv")));
edges.add(new Road(i++,g.mapp.get("Cherkassy"),g.mapp.get("Poltava")));
edges.add(new Road(i++,g.mapp.get("Cherkassy"),g.mapp.get("Kirovograd")));
edges.add(new Road(i++,g.mapp.get("Cherkassy"),g.mapp.get("Dnipropetrovks")));
edges.add(new Road(i++,g.mapp.get("Poltava"),g.mapp.get("Dnipropetrovks")));
edges.add(new Road(i++,g.mapp.get("Kirovograd"),g.mapp.get("Odesa")));
edges.add(new Road(i++,g.mapp.get("Kirovograd"),g.mapp.get("Mykolaiv")));
edges.add(new Road(i++,g.mapp.get("Kirovograd"),g.mapp.get("Zaporizhzhya")));
edges.add(new Road(i++,g.mapp.get("Kirovograd"),g.mapp.get("Dnipropetrovks")));
edges.add(new Road(i++,g.mapp.get("Dnipropetrovks"),g.mapp.get("Zaporizhzhya")));
edges.add(new Road(i++,g.mapp.get("Zaporizhzhya"),g.mapp.get("Mykolaiv")));
edges.add(new Road(i++,g.mapp.get("Odesa"),g.mapp.get("Mykolaiv")));
edges.add(new Road(i++,g.mapp.get("Mykolaiv"),g.mapp.get("Kherson")));
edges.add(new Road(i++,g.mapp.get("Kherson"),g.mapp.get("Simferopol")));
edges.add(new Road(i++,g.mapp.get("Zaporizhzhya"),g.mapp.get("Kherson")));
edges.add(new Road(i++,g.mapp.get("Kherson"),g.mapp.get("Donetsk")));
edges.add(new Road(i++,g.mapp.get("Zaporizhzhya"),g.mapp.get("Donetsk")));
edges.add(new Road(i++,g.mapp.get("Dnipropetrovks"),g.mapp.get("Donetsk")));
edges.add(new Road(i++,g.mapp.get("Dnipropetrovks"),g.mapp.get("Kharkiv")));
edges.add(new Road(i++,g.mapp.get("Kharkiv"),g.mapp.get("Donetsk")));
edges.add(new Road(i++,g.mapp.get("Kharkiv"),g.mapp.get("Lugansk")));
edges.add(new Road(i++,g.mapp.get("Donetsk"),g.mapp.get("Lugansk")));
//Stvoryuemo spochatku mnozhynu habiv
HashMap<Integer,Set<Integer>> forest=new HashMap<Integer,Set<Integer>>();
 for (i=0;i<m.size();i++)
 {
 Set<Integer> vs=new HashSet<Integer>();
 vs.add(m.get(i).num);
 forest.put(m.get(i).num,vs);
 }
 Collections.sort(edges);
// List<Road> mst=new ArrayList<Road>();
 for (i=0;i<edges.size();i++){
 Road check=edges.get(i);
 Set<Integer> visited1=forest.get(check.City1.num);
 Set<Integer> visited2=forest.get(check.City2.num);
 if(visited1.equals(visited2)) 
 continue;
 mst.add(check);
 visited1.addAll(visited2);
 for(Integer k:visited1)
 {
 forest.put(k,visited1);
 }
 if(visited1.size()==m.size())
 break;
 }
}
  
public void createmst () {
Mistax g=new Mistax();
try { g.mista();}
catch (Exception e) {e.printStackTrace();}
HashMap<City,Set<City>> forest=new HashMap<City,Set<City>>();
 for(City vertex:m)
 {
 Set<City> vs=new TreeSet<City>();
 vs.add(vertex);
 forest.put(vertex,vs);
 System.out.println(forest.get(vertex));
 }
 }
        
public static void main (String[] args){
Mistax gg=new Mistax();
//try { gg.mista();
//gg.citynames ();
//gg.createmapp ();
//}
//catch (Exception e) {e.printStackTrace();}
gg.createdges ();
//createmst();
 for (Road j:edges){
System.out.println(j.nom+" "+j.getDistance()+" "+j.City1.name+" "+j.City2.name);}
System.out.println(edges.size());
 } 
}