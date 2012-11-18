

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//使用しない（削除可能）
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//エンコード設定をする。（これをしなければ文字化けすることがある。）
		request.setCharacterEncoding("UTF-8");

		//getParameterメソッドでjspから送られた値を取得する。
		//※引数はinputタブのnameの値
		String value = (String) request.getParameter("textValue");
		//ここで色々いじったりする。
		String returnValue = value + "_return";

		//リクエストで次にデータを引き継ぐ。
		//引き継ぐ値はsetAttributeメソッドでセットする。※引数1:キー, 引数2;キーに紐付けたい値）
		request.setAttribute("returnValue", returnValue);

		//リクエストを送る（ディスパッチャークラスのフォワードメソッドを使う）。
		//下は二文に分けたがこれで可能→resuest.getRequestDispatcher(遷移先のパス).forward(request, response);
		RequestDispatcher dis = request.getRequestDispatcher("ReturnTest.jsp");
		dis.forward(request, response);
	}

}
