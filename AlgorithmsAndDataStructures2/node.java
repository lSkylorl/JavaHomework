package AlgorithmsAndDataStructures2;

public class node {
    node left, right;
    int data;
    boolean color;
  
    node(int data) 
    {
      this.data = data;
      left = null;
      right = null;
      color = true;
    }
}
