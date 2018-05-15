
#include<stdio.h> 

  

int main(void) 

{ 

    int i, j, k, n, m; 

    for (i = 1; i <= 9; ++i) 

    { 

        for (j = 1; j <= 9; ++j) 

        { 

            if (i == j) 

            { 

                continue; 

            } 

            for (k = 1; k <= 9; ++k) 

            { 

                if (i == k || j == k) 

                { 

                    continue; 

                } 

                n = i * 100 + j * 10 + k; 

                m = 1; 

                while (m * m <= n) 

                { 

                    if (m * m == n) 

                    { 

                        printf("%d\n", n); 

                    } 

                    m++; 

                } 

            } 

        } 

    } 

    return 0; 

}
