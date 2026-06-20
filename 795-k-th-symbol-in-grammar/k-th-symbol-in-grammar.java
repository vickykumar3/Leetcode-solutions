class Solution {
    public int kthGrammar(int n, int k) {
        
        if( k== 1) {
            return 0;
        }

        int parent = kthGrammar(n-1, (k+1)/2);

        if(parent==0) {
            if(k%2==1) //first position
            return 0;
            else // second parent
            return 1;
        }
        else // parent == 1
        {
            if(k%2==1) // first child
            return 1;
            else
            return 0;
        }
    }
}