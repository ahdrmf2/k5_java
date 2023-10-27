
package Chap7;

public class GalaxyMessenger implements Messenger, WorkFile {

	
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메세지를 설정합니다 : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치후 키보드를 변경합니다.");
	}

	@Override
	public void fileUpload() {
	System.out.println("flie을 업로드합니다");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fileDownload() {
		System.out.println("flie을 다운로드합니다");
		// TODO Auto-generated method stub
		
	}
	
}
