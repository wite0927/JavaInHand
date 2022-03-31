public class chap02_03 {
    //IntTypeDemo p.56
    public static void main(String[] args) {
        int hexNum = 0x10;
        int octNum = 010;

        System.out.println("hexNum 10진수 출력 : " +hexNum);
        System.out.println("octNum 10진수 출력 : " +octNum);

        System.out.printf("hexNum 16진수 출력 : %x\n", hexNum);
        System.out.printf("octNum 8진수 출력 : %o", octNum);
    }
    
}
//16진수는 %x, 8진수는 %o, 실수는 %f, 10진수는 %d
//printf 자동 개행 안됨.