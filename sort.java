class sort
{
public static void main(String[] args)
{
String []array={"banana","apple","orange","strawberry"};
for(int i=0;i<array.length-1;i++)
{
for(int j=i+1;j<array.length;j++)
{
if(array[i].compareTo(array[j])>0)
{
String temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}

for(int i=0;i<array.length;i++)
{
System.out.println(array[i]);
}
}
}
