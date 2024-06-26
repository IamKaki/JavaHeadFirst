// the main method instantiates drinkers and directs them to a newly-instantiated wall of beer.
public class Sing99Bob {
  public static void main(String[] args) {
    ((NeedToFindBeer)(new Drinkers())).pointAtBeer(new WallOfBeer());
  }
}

  interface NeedToFindBeer { void pointAtBeer(WallOfBeer wob); }

  /* an instance of Drinkers, after being pointed at a wall containing beer, will periodically take one down.  The singing is driven by the taking of the beer. */
  class Drinkers extends Thread implements NeedToFindBeer {
    static final int drinkRate = 2;
    WallOfBeer ourBeer;
    public void run() {
      while (ourBeer.takeOne()>0) {
       try { Thread.sleep(drinkRate*1000); } catch (InterruptedException ignore) {}
      }
    }
    public void pointAtBeer(WallOfBeer wob) {
      ourBeer = wob;
      this.start();
    }
  }

  interface Countable { int howMany(); }

  /* an instance of a WallOfBeer will maintain a count of the beer bottles.  The wall has an associated Narrator who reports each time the number of bottles is changed. */
  class WallOfBeer implements Countable {
    static final int full = 99;
    int count = 0;
    WallWatcher ww;
    {
      ww = new Narrator();
      putSome(full);
    }
    void putSome(int some) {
      count += some;
      if (ww!=null) ww.wallEvent(this);
    }
    int takeOne() {
      count--;
      if (ww!=null) ww.wallEvent(this);
      return count;
    }
    public int howMany() { return count; }
  }

  interface WallWatcher { void wallEvent(Countable wob); }

  /* an instance of Narrator sings the verse each time it is notified that something has happened to the wall.  This narrator attempts to be grammatical, and uses words for the bottle count (singers sing words not numerals). The singing is paced, not merely lump-dumped to sysout. */
  class Narrator implements WallWatcher {
    static final int singspeed = 500;
    public void wallEvent(Countable wob) {
      int b = wob.howMany();
      try {
        System.out.print(bob(b, true)+onwall+", ");
        Thread.sleep(singspeed);
        System.out.print(bob(b, false)+".\n");
        Thread.sleep(singspeed);
        System.out.print((b>0)?takedown:gostore);
        Thread.sleep(singspeed);
        System.out.print((b>0)?bob(b-1, false):bob(WallOfBeer.full, false));
        System.out.print(onwall+".\n");
      } catch (InterruptedException ignore) {}
    }
    static final String bob(int i, boolean c) {
      String word = word(i);
      if (c) word = (word.substring(0, 1).toUpperCase())+word.substring(1);
      return word+" bottle"+((i==1)?"":"s")+" of beer";
    }
    static final String word(int i) {
      if (i==0) return "no more";
      if (i<20) return units[i];
      return tens[i/10]+((units[i%10]=="")?"":"-"+units[i%10]);
    }
    static final String
      onwall = " on the wall",
      takedown = "Take one down and pass it around, ",
      gostore = "Go to the store, get some more, ";
    static final String[]
      tens = {"", "", "twenty", "thirty", "forty",
              "fifty", "sixty", "seventy", "eighty", "ninety"},
      units = {"", "one", "two", "three", "four", "five", "six", "seven",
               "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
               "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
  }
