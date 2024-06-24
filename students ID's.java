Students in a class have been assigned a unique ID. As part of a quiz competition, the class teacher wishes to form two different groups from the N number of students who are participating the quiz. All participants are currently sitting a random manner, but teacher wishes all of them to sit according their ID’s. Two groups will be formed in such a way that students whose seat number in an odd number will be the first group and students whose seat number is an even number will be in the second group. Write an algorithm to find the list of which students IDs should be in the first group, followed by the student ID’s which should be in the second group as per the teacher’s instructions.

Input Format

First line n denotes number of students Second line n elements representing students IDs for all the participants.

Constraints

1<=n<=10^7

Output Format

Print N space separated integers representing the students IDs of first group followed by the student’s IDs of the second group.

Sample Input 0

6
6 9 10 4 2 11
Sample Output 0

2 6 10 4 9 11
Explanation 0

Step 1: Students should sit according to their IDs. So we get {2,4,6,9,10,11} Step 2: Students with an odd numbered seat

Sample Input 1

8
10 8 24 12 44 31 3 16
Sample Output 1

3 10 16 31 8 12 24 44



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<n;i+=2){
            System.out.print(a[i]+" ");
        }
        for(i=1;i<n;i+=2){
            System.out.print(a[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
