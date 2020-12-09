import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    if (end < start){
      throw new IllegalArgumentException("Illegal argument");
    }
    this.current = start;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return (end - start + 1);
  }
  public boolean hasNext(){
    return (current <= end);
  }

  //@throws NoSuchElementException
  public int next(){
    if (current > end) throw new NoSuchElementException("No element");
    current++;
    return (current - 1);
  }

}
