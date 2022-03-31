public class chap02_06 {
    //TypeConversionDemo p.67
    public static void main(String[] args) {
        long longSum = 1 + 1L;
        int longSum2 = 1 + (int)1L;
        int longSum3 = (int)(1 + 1L);

        System.out.println("longSum : " + longSum);
        System.out.println("longSum2 : " + longSum2);
        System.out.println("longSum3 : " + longSum3);
    }
}
//데이터 유실이 일어나지 않게, 작은쪽을 크게 형 변환
//int = int + long 일 때, 에러