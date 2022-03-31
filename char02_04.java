public class char02_04 {
    //OverflowDem p.57
    public static void main(String[] args) {
        byte b = 0;
        while(true){
            b++;
            System.out.println("b : " +b);
        }
    }
}
//byte 형은 -127~128 이므로, 계속 1씩 증가하다보면 오버플로우 발생
//왔다 갔다 함.