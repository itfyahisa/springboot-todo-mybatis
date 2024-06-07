SwaggerのAPI仕様書を参考に以下のTodo ListのAPIを作成してください。  
初級編で作成したAPIにDBとの連携を追加してください。  

Spring Bootを使用してRESTfulなTODO APIの構築  

▼TODOエンティティにほしい要素：  
　済・ID  
　済・タイトル  
　済・ステータス（未着手、進行中、完了）  
　済・詳細  

▼APIで実現したい基本的な機能：  
　済・TODOの追加（POSTエンドポイント）  
　済・TODOの一覧取得（GETエンドポイント）  
　済・TODOの詳細取得（GETエンドポイント、ID指定）  
　済・TODOの削除（DELETEエンドポイント、ID指定）  

▼余裕があれば以下のカスタマイズを実装する：  
　済・TODOの編集機能（PUTエンドポイント、ID指定）  
　　・TODOのフィルタリング機能（ステータス、タイトルで絞り込み）  
　　・TODOのソート機能（ID、ステータスで並べ替え）  
　済・余分な要素の追加（作成日、更新日など）  
　　・ステータス変更に伴うレスポンスのスタイル変更  
　済・一般的なエラーハンドリングの実装（例：存在しないIDへのリクエスト）  

▼応用機能：  
　　・Lombokを利用して、モデルクラスの冗長性を減少させる。  

▼データベースとの連携に関する要件：  
　済・MySQLまたはPostgreSQLをローカルにセットアップ  
　済・MyBatisの設定とマッピングのためのXMLファイルを用意  

