import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    if (end < start){
      this.end = start;
      this.start = end;
    }
    this.current = start;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return (end - start);
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