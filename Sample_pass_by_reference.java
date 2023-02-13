class Sample_pass_by_reference
{
int m=10;
static void add(Sample_pass_by_reference s2)
{
System.out.println(s2.m);
}
public static void main(String[] args)
{
Sample_pass_by_reference s1=new Sample_pass_by_reference();
add(s1);
}
}