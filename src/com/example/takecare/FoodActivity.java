package com.example.takecare;




import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class FoodActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food);
		
		int[] resId = { R.drawable.food_1_nommae, 
						R.drawable.food_2_jokericebanana, 
						R.drawable.food_3_milkapple,
						R.drawable.food_4_vagetom,
						R.drawable.food_5_bread,
						R.drawable.food_6_jokefuktjong,
						R.drawable.food_7_fukfish,
						R.drawable.food_8_porkrice}; 

		String[] list = { "�á�Դ - 4 ��͹" + 
		"�դ�������ö㹡�ôٴ ��׹ ��лԴ�ҡ �������ѡ��͹�ӹ���� �ҡ���������������ǧ��� �١������鹴ѹ������͡�� �����ѧ�� Tongue thrust reflex"
		,"4 � 6 ��͹ "  +
		"���ǻ�蹡���¤�ٴ" + 
		"��ǹ���" +
        "����¹������ء		8	��͹���" +
        "���ǡ��ͧ�ء		8	��͹���" +
        "�������		8	�͹�� ���ͨ����ӹ�������" +
        "��ӵ���ء		6	�͹��" +
        "�Ըշ�" +
        "1. �������ء ����¹����� �� ��й�ӵ���ء (������� �����ӷ��й���ŧ�㹢�л�� ������������ǹ��������Թ�) ŧ�����ͧ���" +
        "2.�ҡ��鹡������дѺ����ҡ�͹ ���Ǥ�������дѺ ���ǻ�蹨���ǹ����ء���ҧ��ҡѹ����������¹�����´"
        ,"4 � 6 ��͹" +
        "�ͻ���ŵ����" +
        "��ǹ���" + 
        "�ͻ���� 	2	�١" +
        "������� 	9	�͹��" +
        "���ǡ��ͧ�ء 	8	��͹���" +
        "�Ըշ�" +
        "1. �͡���͡�ͻ���� ��ҧ������Ҵ ��������繪������" +
        "2. �����������͹� �������� �ͻ���� �����ء ��������� ���ѧ����������ʹ������ (���俻���ҳ 7 �ҷ�) ������ͻ�����ء������" +
        "3.¡��ǹ���ŧ�ҡ�� ������������ �ҡ��鹡��任�������ͧ��������������¹�����´"
        ,"7-9��͹  ���������й��Ǫ����Ժ����� ������Թ����èҡ��͹��բ�� ����ѡ������ ����������բ�Ҵ������紶��� ���ͻ�ͧ�ѹ����õԴ��"
        ,"8-10 ��͹" + "��������������������¨ҡ�ѹ������ҹ˹����ա��ҹ˹���� �����������Өҡ����� ����Ҩ����ˡ��ҧ��硹��� �ҡ������١�Թ����ѧ " +
        "���͢���ѧ��ͺ��÷�����硹��� ���ͻ�ͧ�ѹ��������ɢ���ѧ�Դ��"
        ,"9-12 ��͹ (1��)" +
        "��Ͷ��¹����Ъ�͹���ͧ ������������������������������֡��� �ʴ�����ʹ��������繤س��ͤس���Թ����� �������ͧ��ا�ʪҵ������âͧ�١����硹��� ������ѧ���������������ҡ�Թ�"
        +"�꡿ѡ�ͧ��С���º�" +
        "��ǹ���" +
        "������¹����		����	���µǧ"+
        "���Ϳѡ�ͧ�Ѻ�����´ ����	���µǧ (��ѡ�ͧ��������ǡ���)" +
        "���͡����	1��ǹ4	���µǧ (�ٴ���������)" +
        "������Ҵ		1-2	���µǧ (��ҵ���ҹ�� 2 ���µǧ����)"+
        "�Ըշ�" +
        "1. ��͡���͡����� �������͹����� �ٴ�������ǹ����� �����ǹ������������ ��� �ͧ᡹��ҧ����" +
        "2. ����������ͨ���ʹ ���ѡ�ͧ ���� ����� ŧ�����Ǩ��������Ѿ�� �������Ӣ���������ǹ��� ��������´����ǵ�ͨ������������͹��" 
        ,"18-24 ��͹ (2 ��)" +
        "�ѡ��㹡�����͹�����բ���ҡ��ѡ�ҹ�����͡�ҡ������������֡���� �������������¹����� �������Ӿٴ������� �� �����ա� ���� ��������ǔ �����ʴ����س�������������������"+
        "���� �ѡ��빻��" +
        "��ǹ���"+
        "1. �ѡ��͹�Ѻ�����´  1��ǹ4 ����" +
        "2. ��ӫػ   ���¤���" +
        "��ҹ�Ө״���͡��ҧ�����" +
        "�����Ǣ��  ����  ��͹��" +
        "�Ըշ�" +
        "1. ������ͻ�ҡѺ��ӫػ���ء ��ا�ʴ��«����Ǣ�� ¡ŧ" +
        "2. �ѡ������ ���ѡ�Ѻ ŧ�����ѧ�֧����ҳ 10 �ҷ� ���Ϳѡ�ء�������� �Թ���Ѻ���������͹�"
        ,"24-36 ��͹ (3 ��)" +
        "������Թ��������ͧ ���������Ѳ�ҷѡ������ǡѺ��áԹ���� �� ����ҷ���������� ��������СԹ�������ҡ���� �ҡ�س����ʹͷҧ���͡ �� ���ǼѴ ���� ���ǵ�� ��ҵ�ǹ��¡���դ����آ�ҡ���������͡����÷���ҵ�ͧ��� ��ա����§������˹���� �� ������ ��������ê������ ���� �蹶����ѹ��ͺ��ͺ �ҡ��������������âͧ�١����繪������" +
        "������й� ���˹����٫�����" +
        "��ǹ���" +
        "1. �����Ŵ�  1 ����˭�" +
        "2. ������ �駢���⾴ ��й���ѹ���" +
        "3. �������		1 �Ѿ��" +
        "4. ��ͷ�������ǡ  2 ��͹���" +
        "5. ���ͤ����ǡ 4-5 �͡" +
        "�Ըշ�" +
        "1. ��Ŵ���������繪�鹺ҧ� ��Ҵ��͹��ҧ�˭� �غ���·��غ���������������ͧ��ѡ (������ �駢���⾴ ��й���ѹ���) ������������բ����з�����ء" +
        "2. ��駡�з��������ѹ��硹��� �����ŧ仼Ѵ���ء �ѡ�ҧ�����������͹� ����쿤��Ѻ�ѡ�����������"
        
	     };
	
	CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);
	
	ListView listView = (ListView)findViewById(R.id.listView1);
    listView.setAdapter(adapter);
    listView.setOnItemClickListener(new OnItemClickListener() {
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {

		}
    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.food, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
