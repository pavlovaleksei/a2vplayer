let me = this;
(function loadMedias() {
    me.getFiles();
})();

function addMediaInPlayList(media) {
    media.map(v => {
        v.files.map(rec => {
            let div = document.createElement('div');
            div.className = 'container';
            div.innerHTML = '<video class="container" controls data-plur-config=\'{"title": "This is an example video", "volume": 1, "debug": true }\'>' +
                '<source src="/video-mp4?path=' + rec + '"type="video/mp4"/>' +
                '<source src="/video-webm?path=' + rec + '"type="video/webm"/>' +
                '<source src="/video-ogg?path=' + rec + '"type="video/ogg"/>' +
                '</video>' + '<span style="color: whitesmoke">'  + rec + '</span>'
            document.body.insertBefore(div, document.body.firstChild);
        })
    })
}

function getFiles() {
    fetch('/media')
        .then(resp => {
            return resp.json()
        })
        .then(resp => {
            console.log(resp)
            me.addMediaInPlayList(resp);
        })
        .catch(console.error)
};



