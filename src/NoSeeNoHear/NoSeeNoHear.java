package NoSeeNoHear;

import java.util.*;
import java.io.*;

/*첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 
 * 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
 *  이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.*/

//문자열 하나만을 탐색하야 하기 때문에 SetHash함수를 이용했다.

public class NoSeeNoHear {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    StringTokenizer st = new StringTokenizer(bf.readLine());
	    
	    int n1 = Integer.parseInt(st.nextToken());
	    int n2 = Integer.parseInt(st.nextToken());
	    
	    //빠른 탐색을 위해 Hash함수흫 이용
	    Set<String> hash = new HashSet<>();
	    //탐색한 문자열을 저장할 바열
	    String[] arr = new String[n2];
	    
	    for(int i = 0; i < n1; i++) {
	    	hash.add(bf.readLine());
	    }
	    for(int i = 0; i < n2; i++) {
	    	arr[i] = bf.readLine();
	    }
	    //같은 문자를 발견하면 저장할 배열 개수를 모르기 때문에 ArrayList로 선언
	    ArrayList<String> arr2 = new ArrayList<>();
	    
	    for(int i = 0; i < n2; i++) {
	    	//배열에 값이 있는지 확인하는 contains 함수를 사용해서 검색
	    	if(hash.contains(arr[i])) {
	    		
	    		arr2.add(arr[i]);
	    	}
	    }
	    //ArrayList의 문자열을 정렬하기 위해 사용
	    Collections.sort(arr2);
	    System.out.println(arr2.size());
	    for(String k : arr2) {
	    	bw.write(k + "\n");
	    	
	    }
	    bw.flush();
	    bw.close();
	}

}
