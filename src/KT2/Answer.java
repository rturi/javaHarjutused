package KT2;

/**
 * Created by Roland on 01/12/2015.
 */


/*public class Answer {

    public static void main (String[] args) {
        int[] res = veeruMinid (new int[][] { {1,2,6}, {4,1,3} }); // {1, 2, 3}
        // YOUR TESTS HERE;
    }

    public static int[] veeruMinid (int[][] m) {
        int[] result = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            result[i] = m[i][0];
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j] < result[i]) result[i] = m[i][j];
            }
        }
        return result;
    }

}*/

/*public class Answer {

    public static void main (String[] args) {
        System.out.println (result (new double[]{0., 1., 2., 3., 4.}));
        // YOUR TESTS HERE
    }

    public static double result (double[] marks) {
        double finalMark = 0.;
        double highestMark = marks[0];
        double lowestMark = marks[0];



        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < lowestMark) lowestMark = marks[i];
            if (marks[i] > highestMark) highestMark = marks[i];
            finalMark = finalMark + marks[i];
        }

        finalMark = (finalMark - highestMark - lowestMark) / (marks.length - 2);

        return finalMark;
    }

}*/

/*public class Answer {

    public static void main (String[] args) {
        String s = "Tere, TUDENG, tore ARVUTI sul!";
        String t = asenda (s); // "T---, TUDENG, ---- ARVUTI ---!"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {

        String resultString = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'x'){;
                resultString = resultString + '-';
            } else resultString = resultString + s.charAt(i);
        }
        s = resultString;
        return s;
    }

}*/

/*
public class Answer {

    public static void main (String[] args) {
        int[][] res = liitmisTabel (9);
    }

    public static int[][] liitmisTabel (int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = i + j;
            }
        }

        return result;
    }

}*/

/*public class Answer {

    public static void main (String[] args) {
        int[][] res = muster (9);
    }

    public static int[][] muster (int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + j) * ( i+ j);
            }
        }

        return result;

    }

}*/

/*public class Answer {

    public static void main (String[] args) {
        String s = "Tere, TUDENG!";
        String t = asenda (s); // "_ere, ______!"
        System.out.println (s + " --> " + t);
    }

    public static String asenda (String s) {
        String resultString = "";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'X'){;
                resultString = resultString + '_';
            } else resultString = resultString + s.charAt(i);
        }
        s = resultString;
        return s;
    }

}*/

/*
public class Answer {

    public static void main (String[] args) {
        System.out.println (score (new int[]{4, 1, 2, 3, 0})); // 9
        // Your tests here
    }

    public static int score (int[] points) {
        int finalMark = 0;
        int lowestMark = points[0];
        int secondLowestMark = points[1];

        if (points[1] < points [0]) {
            lowestMark = points [1];
            secondLowestMark = points[0];
        }

        for (int i = 0; i < points.length; i++) {
            if (points[i] <= lowestMark){
                secondLowestMark = lowestMark;
                lowestMark = points[i];
            } else
            if (points[i] < secondLowestMark) secondLowestMark = points[i];
            finalMark = finalMark + points[i];
        }
        finalMark = finalMark - secondLowestMark - lowestMark;

        return finalMark;
    }

}*/


/*
public class Answer {

    public static void main (String[] args) {
        int[][] res = liitmisTabel (9);
    }

    public static int[][] liitmisTabel (int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = i + j;
            }
        }



        return answer;
    }

}*/

/*public class Answer {

    public static void main (String[] args) {
        System.out.println (score (new int[]{4, 1, 2, 3, 0})); // 9
        // Your tests here

    }

    public static int score (int[] points) {
        int finalMark = 0;
        int lowestMark = points[0];
        int secondLowestMark = points[1];

        if (points[1] < points [0]) {
            lowestMark = points [1];
            secondLowestMark = points[0];
        }

        finalMark = lowestMark + secondLowestMark;

        for (int i = 2; i < points.length; i++) {

            finalMark = finalMark + points[i];

            if (points[i] <= lowestMark){
                secondLowestMark = lowestMark;
                lowestMark = points[i];
                continue;
            }
            if (points[i] < secondLowestMark) secondLowestMark = points[i];


        }


        finalMark = finalMark - secondLowestMark - lowestMark;

        return finalMark;
    }

}*/

public class Answer {

    public static void main (String[] args) {
        int[] res = veeruMaxid (new int[][] { {1}, {4, 5, 6} }); // {4, 5, 6}
        // YOUR TESTS HERE

    }

    public static int[] veeruMaxid (int[][] m) {

        int maxRowLength = 0;

        for (int i = 0; i < m.length; i++) {

            if (m[i].length > maxRowLength) maxRowLength = m[i].length;

        }
        System.out.println(maxRowLength);


        int[] result = new int[maxRowLength];




        for (int i = 0; i < m[0].length; i++) {
            result[i] = m[0][i];
            for (int j = 0; j < m.length; j++) {
                if(m[j][i] > result[i]) result[i] = m[j][i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }

}
