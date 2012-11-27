package nod;
public class Node{
public int data;
public Node* prev;
public Node* next;
public Node(){};
public void setData(int aData){data=aData;};
public void setPrev(Node aPrev){prev=aPrev;};
public void setNext(Node aNext){next=aNext;};
public int Data(){return data;};
public Node* Prev(){return prev;};
public Node* Next(){return next;};
}