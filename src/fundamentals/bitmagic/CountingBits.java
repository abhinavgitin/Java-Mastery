class CountingBits {

    static void main() {
        CountingBits bits = new CountingBits();
        for ( int i : bits.countBits(2)) {
            System.out.println(i+" ");
        }
    }
    public int[] countBits(int n) {
        int countBits = 0;
        int temp = 0;
        int[] ans = new int[n+1];
        for ( int i = 0 ; i <= n ; i++ ) {
            temp = i;
            while ( temp > 0 ) {
                if ( temp % 2 == 1 ) {
                    countBits++;
                }
                temp /= 2;
            }
            ans[i] = countBits;
            countBits = 0;
        }
        return ans;
    }
}