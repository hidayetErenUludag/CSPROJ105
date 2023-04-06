import java.util.*;

class solution {

    static float Taylor_exponential(int n, float x) {
        float exp_sum = 1;
        for (int i = n - 1; i > 0; --i)
            exp_sum = 1 + x * exp_sum / i;
        return exp_sum;
    }
}
