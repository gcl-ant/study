
class FamilyAccount {

	public static void main(String[] args){
		
		boolean isFlag = true;

		//���ڼ�¼�û�����������
		String details = "";

		//��ʼ���
		int balance = 10000;


		while(isFlag){

			System.out.println("----------------��ͥ��֧�������----------------\n");
			System.out.println("                 1 ��֧��ϸ");
			System.out.println("                 2 �Ǽ�¼��");
			System.out.println("                 3 �Ǽ�֧��");
			System.out.println("                 4 ��    ��\n");
			System.out.print("                 ��ѡ��(1-4):");

			//����Utility
			//��ȡ�û�ѡ��1-4
			char selection = Utility.readMenuSelection();
			switch(selection){
				
				case '1':
					System.out.println("----------------��ǰ��֧��ϸ��¼----------------");
					System.out.println("��֧\t�˻����\t��֧���\t˵   ��");
					System.out.println(details);
					System.out.println("------------------------------------------------");
					break;

				case '2':
					System.out.print("����������: ");
					int addMoney = Utility.readNumber();
					System.out.print("��������˵��: ");
					String addInfo = Utility.readString();

					//����balance
					balance += addMoney;

					//����details
					details += ("����\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n");

					System.out.println("-------------------�Ǽ����-------------------\n");
					break;

				case '3':
					System.out.print("����֧�����: ");
					int minusMoney = Utility.readNumber();

					System.out.print("����֧��˵��: ");
					String minusInfo = Utility.readString();

					//����balance
					if(balance >= minusMoney){
						balance -= minusMoney;
					}else{
						System.out.print("֧�������˻����.֧��ʧ��!");
					}

					//����details
					details += ("֧��\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n");

					System.out.println("-------------------�Ǽ����-------------------\n");
					break;

				case '4':
					System.out.print("ȷ���Ƿ��˳�(Y/N): ");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y'){
						isFlag = false;
					}
			}



			



		}




	}
}