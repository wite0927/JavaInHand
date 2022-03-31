public class chap02_02 {
    //CharDemo p.51
    public static void main(String[] args) {
        char c1 = '가';
        System.out.println("char : " +c1);
        char c2 = '\uAC00';
        System.out.println("char : " +c2);

        System.out.format("16진수 %X", (int)c1);
    }
}
// char 형의 크기는 2바이트
// 백슬래쉬u 는 유니코드 , \t ,\n 등이 있음.