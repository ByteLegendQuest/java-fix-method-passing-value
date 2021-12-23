<details open='true'>
<summary>English</summary>

# Understand Instance, Reference and Method Passing Value via Fixing a Bug

`updateToNewCat` method in [src/main/java/com/bytelegend/Updater.java](https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java) is intended to update `Cat` instance of `Home`,
but somehow it doesn't work. Try to understand the problem and fix this issue, so that the `main` method of `Home`
runs with output:

```
Cat is Cat(White)
Cat is Cat(Black)
```

- You can use either way to accomplish the challenge (you'd better test it on your local computer):
  - Use the web editor below.
  - Create a GitHub Pull Request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.


**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Updater.java`
</details>
<details>
<summary>简体中文</summary>

# 通过修复一个Bug理解对象<ruby>引用<rt>Reference</rt></ruby>与<ruby>方法传值<rt>Method Passing Value</rt></ruby>

[src/main/java/com/bytelegend/Updater.java](https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java)的`updateToNewCat`方法尝试将`Home`中的`Cat`对象更新，但是似乎没有生效。
思考一下为什么并修复这个问题，使得`Home`的`main`方法运行输出：

```
Cat is Cat(White)
Cat is Cat(Black)
```

- 你可以使用任意一种方法完成挑战（最好先在自己的本地电脑上测试通过）：
  - 使用下面的网页编辑器。
  - 创建一个GitHub Pull Request。
- 机器人将会检查你的回答，告诉你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。


**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Updater.java`
</details>
<details>
<summary>繁體中文</summary>

<h1>通過修復錯誤了解實例、引用和方法傳遞值</h1><p><a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">src/main/java/com/bytelegend/Updater.java 中的</a><code class="notranslate">updateToNewCat</code>方法旨在更新<code class="notranslate">Home</code> <code class="notranslate">Cat</code>實例，但不知何故它不起作用。嘗試了解問題並修復此問題，以便<code class="notranslate">Home</code> <code class="notranslate">main</code>方法運行並輸出：</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>您可以使用任何一種方式來完成挑戰（最好在本地計算機上進行測試）：<ul><li>使用下面的網絡編輯器。</li><li>創建 GitHub 拉取請求。</li></ul></li><li>機器人將檢查您的 PR 並告訴您是否完成了挑戰。</li><li>回到<a href="https://bytelegend.com" target="_blank">ByteLegend</a> ，繼續你的英雄之旅。</li></ul><p><strong>注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Español</summary>

<h1>Comprender el valor de transferencia de instancia, referencia y método mediante la corrección de un error</h1><p> <code class="notranslate">updateToNewCat</code> método <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">updateToNewCat en src / main / java / com / bytelegend / Updater.java</a> está destinado a actualizar la instancia <code class="notranslate">Cat</code> <code class="notranslate">Home</code> , pero de alguna manera no funciona. Intente comprender el problema y solucionarlo, de modo que el método <code class="notranslate">main</code> <code class="notranslate">Home</code> ejecute con resultados:</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Puede usar cualquiera de las dos formas para lograr el desafío (será mejor que lo pruebe en su computadora local):<ul><li> Utilice el editor web a continuación.</li><li> Cree una solicitud de extracción de GitHub.</li></ul></li><li> El bot comprobará tus relaciones públicas y te dirá si logras el desafío.</li><li> Vuelve a <a href="https://bytelegend.com" target="_blank">ByteLegend</a> y continúa tu viaje de héroe.</li></ul><p> <strong>Nota: solo le permitimos modificar los siguientes archivos. Se rechazará cualquier cambio en archivos que no sean los siguientes:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>العربية</summary>

<h1 style=";text-align:right;direction:rtl">فهم قيمة المثيل والمرجع وطريقة تمرير من خلال إصلاح الخلل</h1><p style=";text-align:right;direction:rtl"> <code class="notranslate">updateToNewCat</code> طريقة <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">updateToNewCat في src / main / java / com / bytelegend / Updater.java</a> لتحديث نسخة <code class="notranslate">Cat</code> <code class="notranslate">Home</code> ، لكنها لا تعمل بطريقة ما. محاولة لفهم المشكلة ولحل هذه المشكلة، بحيث <code class="notranslate">main</code> طريقة <code class="notranslate">Home</code> يعمل مع الإخراج:</p><pre class="notranslate" style=";text-align:right;direction:rtl"> <code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul style=";text-align:right;direction:rtl"><li style=";text-align:right;direction:rtl">يمكنك استخدام أي من الطريقتين لإنجاز التحدي (من الأفضل اختباره على جهاز الكمبيوتر المحلي الخاص بك):<ul style=";text-align:right;direction:rtl"><li style=";text-align:right;direction:rtl"> استخدم محرر الويب أدناه.</li><li style=";text-align:right;direction:rtl"> إنشاء طلب سحب على GitHub.</li></ul></li><li style=";text-align:right;direction:rtl"> سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.</li><li style=";text-align:right;direction:rtl"> ارجع إلى <a href="https://bytelegend.com" target="_blank">ByteLegend وتابع</a> رحلة بطلك.</li></ul><p style=";text-align:right;direction:rtl"> <strong>ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:</strong></p><ul style=";text-align:right;direction:rtl"><li style=";text-align:right;direction:rtl"> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Português</summary>

<h1>Compreenda a instância, a referência e o método de passagem de valor por meio da correção de um bug</h1><p> <code class="notranslate">updateToNewCat</code> método <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">updateToNewCat em src / main / java / com / bytelegend / Updater.java</a> se destina a atualizar a instância <code class="notranslate">Cat</code> <code class="notranslate">Home</code> , mas de alguma forma não funciona. Tente entender o problema e corrigi-lo, para que o método <code class="notranslate">main</code> <code class="notranslate">Home</code> funcione com saída:</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Você pode usar qualquer uma das formas para cumprir o desafio (é melhor testá-lo em seu computador local):<ul><li> Use o editor da web abaixo.</li><li> Crie uma solicitação pull do GitHub.</li></ul></li><li> O bot verificará seu PR e lhe dirá se você cumpriu o desafio.</li><li> Volte para <a href="https://bytelegend.com" target="_blank">ByteLegend</a> e continue sua jornada de herói.</li></ul><p> <strong>Nota: nós apenas permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os seguintes serão rejeitadas:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Bahasa Indonesia</summary>

<h1>Pahami Instance, Referensi, dan Metode Melewati Nilai melalui Memperbaiki Bug</h1><p> metode <code class="notranslate">updateToNewCat</code> <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">di src/main/Java/com/bytelegend/Updater.java</a> dimaksudkan untuk memperbarui instance <code class="notranslate">Cat</code> <code class="notranslate">Home</code> , tetapi entah bagaimana itu tidak berhasil. Coba pahami masalahnya dan perbaiki masalah ini, sehingga metode <code class="notranslate">main</code> <code class="notranslate">Home</code> berjalan dengan output:</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Anda dapat menggunakan salah satu cara untuk menyelesaikan tantangan (sebaiknya Anda mengujinya di komputer lokal Anda):<ul><li> Gunakan editor web di bawah ini.</li><li> Buat Permintaan Tarik GitHub.</li></ul></li><li> Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.</li><li> Kembali ke <a href="https://bytelegend.com" target="_blank">ByteLegend</a> dan lanjutkan perjalanan pahlawan Anda.</li></ul><p> <strong>Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Français</summary>

<h1>Comprendre la valeur de transmission d&#39;instance, de référence et de méthode via la correction d&#39;un bogue</h1><p> <code class="notranslate">updateToNewCat</code> méthode <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">updateToNewCat dans src/main/java/com/bytelegend/Updater.java</a> est destinée à mettre à jour l&#39;instance <code class="notranslate">Cat</code> <code class="notranslate">Home</code> , mais d&#39;une manière ou d&#39;une autre, cela ne fonctionne pas. Essayez de comprendre le problème et résolvez ce problème, afin que la méthode <code class="notranslate">main</code> <code class="notranslate">Home</code> s&#39;exécute avec la sortie :</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Vous pouvez utiliser l&#39;une ou l&#39;autre manière pour relever le défi (vous feriez mieux de le tester sur votre ordinateur local) :<ul><li> Utilisez l&#39;éditeur Web ci-dessous.</li><li> Créez une demande d&#39;extraction GitHub.</li></ul></li><li> Le bot vérifiera votre PR et vous dira si vous réussissez le défi.</li><li> Retournez à <a href="https://bytelegend.com" target="_blank">ByteLegend</a> et continuez votre voyage de héros.</li></ul><p> <strong>Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification apportée aux fichiers autres que les fichiers suivants sera rejetée :</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>日本語</summary>

<h1>バグ修正によるインスタンス、参照、メソッド受け渡しの値を理解する</h1><p><code class="notranslate">updateToNewCat</code>中にメソッド<a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">のsrc /メイン/ javaの/ COM / bytelegend / Updater.javaを</a>更新するように意図された<code class="notranslate">Cat</code>のインスタンス<code class="notranslate">Home</code> 、何とかそれは仕事をしません。問題を理解してこの問題を修正し<code class="notranslate">Home</code> <code class="notranslate">main</code>メソッドが出力で実行されるようにしてください。</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>どちらの方法でもチャレンジを達成できます（ローカルコンピューターでテストすることをお勧めします）。<ul><li>以下のWebエディタを使用してください。</li><li> GitHubプルリクエストを作成します。</li></ul></li><li>ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。</li><li> <a href="https://bytelegend.com" target="_blank">ByteLegendに</a>戻り、ヒーローの旅を続けてください。</li></ul><p><strong>注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Русский</summary>

<h1>Понимание экземпляра, ссылки и метода, передающего значение посредством исправления ошибки</h1><p> Метод <code class="notranslate">updateToNewCat</code> <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">в src / main / java / com / bytelegend / Updater.java</a> предназначен для обновления экземпляра <code class="notranslate">Cat</code> <code class="notranslate">Home</code> , но почему-то не работает. Постарайтесь разобраться в проблеме и исправить ее, чтобы <code class="notranslate">main</code> метод <code class="notranslate">Home</code> работал с выводом:</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Вы можете использовать любой способ решения задачи (лучше протестируйте его на своем локальном компьютере):<ul><li> Воспользуйтесь веб-редактором ниже.</li><li> Создайте запрос на извлечение GitHub.</li></ul></li><li> Бот проверит ваш PR и скажет, справитесь ли вы с задачей.</li><li> Вернитесь в <a href="https://bytelegend.com" target="_blank">ByteLegend</a> и продолжите свой путь героя.</li></ul><p> <strong>Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих, будут отклонены:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Deutsch</summary>

<h1>Verstehen Sie Instanz-, Referenz- und Methodenübergabewerte durch Beheben eines Fehlers</h1><p> <code class="notranslate">updateToNewCat</code> -Methode in <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">src/main/java/com/bytelegend/Updater.java</a> soll die <code class="notranslate">Cat</code> Instanz von <code class="notranslate">Home</code> aktualisieren, aber irgendwie funktioniert es nicht. Versuchen Sie, das Problem zu verstehen und dieses Problem zu beheben, so dass das <code class="notranslate">main</code> <code class="notranslate">Home</code> läuft mit Ausgang:</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Sie können die Herausforderung auf beide Arten meistern (am besten testen Sie sie auf Ihrem lokalen Computer):<ul><li> Verwenden Sie den untenstehenden Web-Editor.</li><li> Erstellen Sie eine GitHub-Pull-Anfrage.</li></ul></li><li> Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.</li><li> Gehen Sie zurück zu <a href="https://bytelegend.com" target="_blank">ByteLegend</a> und setzen Sie Ihre Heldenreise fort.</li></ul><p> <strong>Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an Dateien, die nicht die folgenden Dateien sind, werden abgelehnt:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>한국어</summary>

<h1>버그 수정을 통한 인스턴스, 참조 및 메서드 전달 값 이해</h1><p> <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">src/main/java/com/bytelegend/Updater.java 의</a> <code class="notranslate">updateToNewCat</code> 메소드는 <code class="notranslate">Home</code> <code class="notranslate">Cat</code> 인스턴스를 업데이트하기 위한 것이지만 어떻게든 작동하지 않습니다. 문제를 이해하고 이 문제를 수정 <code class="notranslate">Home</code> <code class="notranslate">main</code> 방법이 출력과 함께 실행되도록 하십시오.</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>두 가지 방법 중 하나를 사용하여 도전 과제를 수행할 수 있습니다(로컬 컴퓨터에서 테스트하는 것이 좋습니다).<ul><li> 아래 웹 편집기를 사용하십시오.</li><li> GitHub 풀 요청을 만듭니다.</li></ul></li><li> 봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.</li><li> <a href="https://bytelegend.com" target="_blank">ByteLegend로</a> 돌아가 영웅 여정을 계속하세요.</li></ul><p> <strong>참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 모든 변경 사항은 거부됩니다.</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>
<details>
<summary>Italiano</summary>

<h1>Comprendere l&#39;istanza, il riferimento e il metodo passando il valore tramite la correzione di un bug</h1><p> <code class="notranslate">updateToNewCat</code> metodo <a href="https://github.com/ByteLegendQuest/java-fix-method-passing-value/blob/main/src/main/java/com/bytelegend/Updater.java" target="_blank">updateToNewCat in src/main/java/com/bytelegend/Updater.java ha lo</a> scopo di aggiornare l&#39;istanza <code class="notranslate">Cat</code> <code class="notranslate">Home</code> , ma in qualche modo non funziona. Cerca di capire il problema e risolvi questo problema, in modo che il metodo <code class="notranslate">main</code> <code class="notranslate">Home</code> venga eseguito con l&#39;output:</p><pre class="notranslate"><code class="notranslate">Cat is Cat(White)
Cat is Cat(Black)
</code></pre><ul><li>Puoi utilizzare entrambi i modi per completare la sfida (farai meglio a testarlo sul tuo computer locale):<ul><li> Usa l&#39;editor web qui sotto.</li><li> Crea una richiesta pull GitHub.</li></ul></li><li> Il bot controllerà il tuo PR e ti dirà se hai portato a termine la sfida.</li><li> Torna su <a href="https://bytelegend.com" target="_blank">ByteLegend</a> e continua il tuo viaggio da eroe.</li></ul><p> <strong>Nota: ti permettiamo di modificare solo i seguenti file. Qualsiasi modifica ai file diversi dai seguenti file verrà rifiutata:</strong></p><ul><li> <code class="notranslate">src/main/java/com/bytelegend/Updater.java</code></li></ul></details>