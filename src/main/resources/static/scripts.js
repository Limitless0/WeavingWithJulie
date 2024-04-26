function submitCode() {

    let textArea = document.getElementById("code");
    let text = textArea.value

    console.log("Example")

    let post = new XMLHttpRequest();
    post.open("POST", "/codeIn", true);

    post.send(text);
    console.log(text)
}