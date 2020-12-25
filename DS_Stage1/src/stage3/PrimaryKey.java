
	public class PrimaryKey 
	{
		private String [] PK;
		
		private Keyword keyword;
		
		private LinkedList<Keyword> lst;
		
		private LinkedList<Keyword> lst1;
		private LinkedList<Keyword> lst2;
		
		private LinkedList<Keyword> lst3;
		
		private int PKCount;
		//根據使用者增加PK資料數據
		
		
		
		public PrimaryKey()
		{
			String [] PK = new String[3];//根據使用者有多少個PK
			Keyword keyword = new Keyword(null, 0, 0);
			this.lst = new LinkedList<Keyword>();
			this.lst1 = new LinkedList<Keyword>();
			this.lst2 = new LinkedList<Keyword>();
			
			this.PKCount = 0;
		
		}
		
		public void CountPrimaryKey()
		{
			
			for(int i=0; i<3; i++)
			{
				if(PK[i] == keyword.keywordName)
				{
					PKCount = 1;
					break;
				}
			}
//			return PKCount;
		}
		
		public void DisplayOrder()
		{
			
			for(Keyword k : lst)
			{
				if(PKCount == 1)
				{
					lst1.add(k);
				}		
				else
				{
					lst2.add(k);
				}
			}

				
//				keyword.count
		}
		
		public void sort() {
			quickSort1(0, lst1.size() - 1);
			quickSort2(0, lst2.size() - 1);
		}

		private void quickSort1(int leftbound, int rightbound) {
			
			// implement quickSort algorithm
			
			if(leftbound >= rightbound)
			{
				return;
			}
			
			int pivot = lst1.get(rightbound).count;
			int i = leftbound;
			int j = rightbound-1;
			
			while(i<j)
			{
				while(lst1.get(i).count<= pivot)
				{
					i++;
					
					if(lst1.get(j).count >= pivot)
					{
						j--;
					}
				}
				
				if(i<j)
				{
					swap1(i , j);
				}
				
				
			}
			
			swap1(rightbound , i);
			
			quickSort1(leftbound, i-1);
			quickSort1(i+1, rightbound);
			
		
		}

private void quickSort2(int leftbound, int rightbound) {
			
			// implement quickSort algorithm
			
			if(leftbound >= rightbound)
			{
				return;
			}
			
			int pivot = lst2.get(rightbound).count;
			int i = leftbound;
			int j = rightbound-1;
			
			while(i<j)
			{
				while(lst2.get(i).count<= pivot)
				{
					i++;
					
					if(lst2.get(j).count >= pivot)
					{
						j--;
					}
				}
				
				if(i<j)
				{
					swap2(i , j);
				}
				
				
			}
			
			swap2(rightbound , i);
			
			quickSort2(leftbound, i-1);
			quickSort2(i+1, rightbound);
			
		
		}
		private void swap1(int aIndex, int bIndex) {
			Keyword temp = lst1.get(aIndex);
			lst1.set(aIndex, lst1.get(bIndex));
			lst1.set(bIndex, temp);
		}
		
		private void swap2(int aIndex, int bIndex) {
			Keyword temp = lst2.get(aIndex);
			lst2.set(aIndex, lst2.get(bIndex));
			lst2.set(bIndex, temp);
		}

		public void output() {
			// TODO: write output and remove all element logic here...
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();


			for (int i = lst1.size()-1 ; i < 0; i--) 
			{
				Keyword k = lst1.get(i);
			
				
				if (i > 0)///？
				
				sb1.append(" ");
				sb1.append(k.toString());
			}
			System.out.println(sb1.toString());
			
			
			for (int i = lst2.size()-1 ; i < 0; i--) 
			{
				Keyword k = lst2.get(i);
			
				
				if (i > 0)///？
				
				sb2.append(" ");
				sb2.append(k.toString());
			}
			System.out.println(sb2.toString());
		}
		
		public LinkedList<Keyword> getLst1() {
			return lst1;
		}

		public void setLst1(LinkedList<Keyword> lst1) {
			this.lst1 = lst1;
		}
		public LinkedList<Keyword> getLst2() {
			return lst2;
		}

		public void setLst2(LinkedList<Keyword> lst2) {
			this.lst2 = lst2;
		}
	
	
	}
//Primary key 就是傳給google的東西
//決定原始資料排序的東西
//到爬蟲的東西