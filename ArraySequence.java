import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;
  /*public int next() throws NoSuchElementException{
    if (currentIndex >= data.length) throw new NoSuchElementException("No element");
    currentIndex++;
    return (data[currentIndex - 1]);
  }

  */
  public ArraySequence(int [] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }


  public boolean hasNext(){
    return true;
  }
  public int length(){
    return 0;
  }
  public void reset(){

  }
  public int next(){
    return 0;

  }
}
