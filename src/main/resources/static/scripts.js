function submitCode() {

    const textArea = document.getElementById("code");

    let post = new XMLHttpRequest();
    post.open("POST", "/codeIn", true);
    post.send(textArea.value());
}