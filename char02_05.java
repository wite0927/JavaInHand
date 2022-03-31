import java.math.BigDecimal;

public class char02_05 {
    //FloatPrecisionDemo p.61
    //DoublePrecisionDemo p.62
    //DoubleSum p.62
    public static void main(String[] args) {
        float f = 1.11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111f;
        System.out.println("f : "+f);

        double d = 0.9d;
        System.out.println("double : "+d);
        System.out.println("근접한 내부 표현 : "+new BigDecimal(d));

        double sum = 0;
        for (int i = 0; i<1000; i++){
            sum += d;
        }
        System.out.println(sum);
    }
}
//float형은 크기를 벗어나면 임의로 값을 정한다.
//double은 좀 더 크기가 크지만 마찬가지다.
//정교한 계산 프로그램에서 사용 X
//BigDemical은 명확한 기술을 할 때