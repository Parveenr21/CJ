package a1_Variables;


class Test {
static int a;

Test(int i) {
a = i;
}



Test temp = new Test(a);



Test incrByTen() {
Test temp = new Test(a+10);
return temp;
}

}