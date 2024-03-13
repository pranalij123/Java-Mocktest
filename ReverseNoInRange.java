//write a code to print reverse all numbers from 100 to 200

public class ReverseNoInRange {

    public static void main(String[] args) {
        int start = 100;

        while (start <= 200) {
            int rev = 0;
            int copy1 = start;
            while (copy1> 0) {
                int rem= copy1 % 10;
                rev = (rev * 10) + rem;
                copy1 = copy1 / 10;
            }
            System.out.println(rev);
            start++;

        }
    }
}
/*output:
1
101
201
301
401
501
601
701
801
901
11
111
211
311
411
511
611
711
811
911
21
121
221
321
421
521
621
721
821
921
31
131
231
331
431
531
631
731
831
931
41
141
241
341
441
541
641
741
841
941
51
151
251
351
451
551
651
751
851
951
61
161
261
361
461
561
661
761
861
961
71
171
271
371
471
571
671
771
871
971
81
181
281
381
481
581
681
781
881
981
91
191
291
391
491
591
691
791
891
991
2

*/
