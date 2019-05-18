static short B;
static short H;
static boolean flag=false;
static{
    Scanner scan=new Scanner(System.in);
    B = scan.nextShort();
    H = scan.nextShort();
    if(B>0 && H>0)
        flag=true;
    else
        System.out.println("java.lang.Exception: Breadth and height must be positive");
}
