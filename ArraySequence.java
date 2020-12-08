import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  public ArraySequence(int [] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
    currentIndex = 0;
  }
  public int next(){
    if (currentIndex >= data.length){
      throw new NoSuchElementException("No element");
    }
    currentIndex++;
    return (data[currentIndex - 1]);
  }

  public boolean hasNext(){
    if (currentIndex < data.length){
      return true;
    }
    return false;
  }
  public int length(){
    return data.length;
  }
  public void reset(){
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    int i = 0;
    int[] x = new int[otherseq.length()];
    while (otherseq.hasNext() == true){
      x[i] = otherseq.next();
      i++;
    }
    data = new int[i];
    for(int n = 0; n < data.length; n++){
      data[n] = x[n];
    }
    currentIndex = 0;
  }

}
