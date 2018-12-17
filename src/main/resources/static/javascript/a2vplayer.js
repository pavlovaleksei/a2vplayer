(function loadMedias() {
    this.getFiles();
})();

function addMediaInPlayList(media) {
    media.map(v => {
        let div = document.createElement('div');
        div.className = 'container';
        div.innerHTML = '<video class="container" controls data-plur-config=\'{"title": "This is an example video", "volume": 1, "debug": true }\'>' +
            '<source src="/video-mp4?path=' + v.path + '"type="video/mp4"/>' +
            '<source src="/video-webm?path=' + v.path + '"type="video/webm"/>' +
            '<source src="/video-ogg?path=' + v.path + '"type="video/ogg"/>' +
            '</video>' + '<span style="color: whitesmoke">'  + v.name + '</span>'
        document.body.insertBefore(div, document.body.lastChild);
    })
}

function getFiles() {
    fetch('/media')
        .then(resp => {
            return resp.json()
        })
        .then(resp => {
            console.log(resp)
            this.addMediaInPlayList(resp);
        })
        .catch(console.error)
};



