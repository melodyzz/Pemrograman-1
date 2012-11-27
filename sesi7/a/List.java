package a;
import *.Node;
public class List{
public Node head;
public Node tail;
public List(){head=null;tail=null;};
public void tambahData(int data){
Node tmp = head;
Node setelah;
Node newNode = new Node();
newNode.setData(data);
newNode.setPrev(null);
newNode.setNext(null);

if(tmp==null){
head=newNode;
tail=null;
}
else{
while(tmp.Next()!=null){
tmp=tmp.Next();
}
tmp.setNext(newNode);
setelah=tmp.Next();
setelah.setPrev(tmp);
}
};
public void tampilData(){
Node tmp = head;
if(tmp != null){
System.out.print("Data Kosong \n");
}
else{
System.out.print("NULL->");
System.out.print(tmp.Data());
System.out.print("->");
while(tmp.Next()!=null){
tmp=tmp.Next();
System.out.print(tmp.Data());
System.out.print("->");
}
System.out.print("NULL\n");
}
};
}