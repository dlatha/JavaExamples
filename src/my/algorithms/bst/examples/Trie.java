package my.algorithms.bst.examples;

	public class Trie {
		TrieNode root;
		
		public Trie(){
			root= new TrieNode(' ');
		}
		
		
		public void insert(String s){
			TrieNode curr=root;
			if(s.length()==0)
				curr.marker=true;
			
			for(int i=0;i<s.length();i++){
				TrieNode n=curr.getNode(s.charAt(i));
				if(n!=null)
					curr=n;
				else{
					curr.children.add(new TrieNode(s.charAt(i)));
					curr=curr.getNode(s.charAt(i));
				}
				
				if(i==s.length()-1)
					curr.marker=true;				
			}			
		}
		
		public void search2(String s, TrieNode n){
			TrieNode curr=n;
			while(curr!=null){
				
				for(int i=0;i<s.length();i++){
					if(curr.getNode(s.charAt(i))==null && s.charAt(i)!='.')
						return;
					else if(curr.getNode(s.charAt(i))!=null && s.charAt(i)!='.'){
						curr=curr.getNode(s.charAt(i));
						System.out.print(curr.data);
					}
					else //if(curr.getNode(s.charAt(i))==null && s.charAt(i)=='.')
					{
						System.out.println("\r\n");
						for(TrieNode tmp:curr.children){
							System.out.print(tmp.data);
						}
						System.out.println("\r\n");
						for(TrieNode tmp:curr.children){
							search2(s.substring(i+1,s.length()),tmp);
						}

					}
				}
				
				if(curr.marker==true){
					return;
				}
			}
		}
	}

