import java.lang.reflect.Array;
import java.util.*;

public class GymSuitTest {
    public int GymSuitSolution(int n, int[] lost, int[] reserver) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserver);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserver.length; j++) {
                if(lost[i]==reserver[j]) {
                    lost[i] = 1;
                    reserver[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserver.length; j++) {
                if(lost[i]==reserver[j]+1||lost[i]==reserver[j]-1) {
                    answer++;
                    reserver[j] = -1;
                    break;
                }
            }
        }
        return n - lost.length + answer;
    }
    public static void main(String[] args) {
        GymSuitTest gymSuit = new GymSuitTest();
    }
}
