package com.company.Recursionn;

public class TilingProblem {
//---- tilingProblem(3)
//├── tilingProblem(2)
//│  ├── tilingProblem(1) -> 1
//│  └── tilingProblem(0) -> 1
//└── tilingProblem(1) -> 1

    public static int tilingProblem(int n) {
//        2*n
//         base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main( String[] args ) {
        System.out.println(tilingProblem( 4 ));
    }
}
