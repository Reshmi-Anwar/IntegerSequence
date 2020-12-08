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
  /*Construct the sequence by copying values from the other array into the data array*/
  //public ArraySequence(int [] other){  }


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
