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
    otherseq.reset();
    data = new int[otherseq.length()];
    while (otherseq.hasNext() == true){
      data[i] = otherseq.next();
      i++;
    }
    currentIndex = 0;
    otherseq.reset();
  }

}
