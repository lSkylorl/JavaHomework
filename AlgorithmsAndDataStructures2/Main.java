package AlgorithmsAndDataStructures2;
import java.util.Scanner;

public class Main {
    private static node root = null;

    node rotateLeft(node myNode) 
    {
    System.out.printf("поворот влево\n");
    node child = myNode.right;
    node childLeft = child.left;

    child.left = myNode;
    myNode.right = childLeft;

    return child;
    }

  node rotateRight(node myNode) 
  {
    System.out.printf("поворот вправо\n");
    node child = myNode.left;
    node childRight = child.right;

    child.right = myNode;
    myNode.left = childRight;

    return child;
    }

  boolean isRed(node myNode) 
  {
    if (myNode == null) {
      return false;
    }
    return (myNode.color == true);
  }

  void swapColors(node node1, node node2) 
  {
    boolean temp = node1.color;
    node1.color = node2.color;
    node2.color = temp;
  }

  node insert(node myNode, int data) 
  {
    if (myNode == null) 
    {
      return new node(data);
    }

    if (data < myNode.data) 
    {
      myNode.left = insert(myNode.left, data);
    } else if (data > myNode.data) 
    {
      myNode.right = insert(myNode.right, data);
    } else 
    {
      return myNode;
    }

    if (isRed(myNode.right) && !isRed(myNode.left)) 
    {
      myNode = rotateLeft(myNode);
      swapColors(myNode, myNode.left);
    }

    if (isRed(myNode.left) && isRed(myNode.left.left)) 
    {
      myNode = rotateRight(myNode);
      swapColors(myNode, myNode.right);
    }

    if (isRed(myNode.left) && isRed(myNode.right)) 
    {
      myNode.color = !myNode.color;
      myNode.left.color = false;
      myNode.right.color = false;
    }

    return myNode;
  }

  void internorder(node node) {
    if (node != null)
    {
      internorder(node.left);
      char c = 'b';
      if (node.color == false)
        c = 'r';
      System.out.print(node.data + ""+c+" ");
      internorder(node.right);
    }
  }

  public static void main(String[] args) {

    Main node = new Main();
    Scanner scan = new Scanner(System.in);

    char ch;
    do {
      System.out.print("Введите число: ");

      int num = scan.nextInt();
      root = node.insert(root, num);

      node.internorder(root);
      System.out.println("\nВы хотите добавить число? |введите y или n|");
      ch = scan.next().charAt(0);
    } while (ch == 'Y' || ch == 'y');
  }
}