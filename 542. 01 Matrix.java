class Node {
    int first;
    int second;
    int third; 
    Node(int _first, int _second, int _third) {
        this.first = _first; 
        this.second = _second; 
        this.third = _third; 
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        int dis[][]=new int[n][m];
        Queue<Node> q=new LinkedList<Node>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int rowT[]={-1,0,+1,0};
        int colT[]={0,+1,0,-1};
        
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            int d=q.peek().third;
            q.remove();
            dis[r][c]=d;
            for(int i=0;i<4;i++){
                int row=r+rowT[i];
                int col=c+colT[i];
                if(row>=0 && row<n && col>=0 && col<m && vis[row][col]==0){
                    vis[row][col]=1;
                    q.add(new Node(row,col,d+1));
                }
            }
        }
        return dis;
    }
}
