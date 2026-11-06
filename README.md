# 📝 Article-to-Markdown Cleaner & Reader

A full-stack utility and Chrome Extension that extracts main text content from tech articles/blogs, strips out ads and clutter, and presents it in clean, structured Markdown format.

![Java](https://img.shields.io/badge/Java-21-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)
![Docker](https://img.shields.io/badge/Docker-Containerized-blue.svg)
![Render](https://img.shields.io/badge/Render-Live-success.svg)

---

## ✨ Features

- **DOM Cleaning:** Strips scripts, sidebars, headers, footers, and ad containers using Jsoup parsing.
- **Dual View UI:** Toggle seamlessly between Raw Markdown text and a styled Reader Preview.
- **Chrome Extension (Manifest V3):** Extract articles directly from your browser tab in 1 click.
- **Cloud Backend:** Powered by a containerized Spring Boot API hosted on Render.

---

## 🛠️ Tech Stack

- **Backend:** Java 21, Spring Boot 3, Jsoup
- **Frontend / UI:** HTML5, CSS3 (Slate Tech Theme), Marked.js
- **Browser Extension:** Manifest V3 (JavaScript, HTML/CSS)
- **Deployment:** Docker, Render Cloud Platform

---

## 🧩 Chrome Extension Setup (1-Click Use)

You don't need to build or run the Spring Boot server locally. Follow these steps to install the pre-configured extension:

1. Go to the **[Releases](../../releases)** page of this repository and download `article-cleaner-extension.zip`.
2. Extract/unzip the downloaded ZIP file on your computer.
3. Open Google Chrome and navigate to `chrome://extensions/`.
4. Enable **Developer mode** using the toggle switch in the top-right corner.
5. Click **Load unpacked** in the top-left corner and select the unzipped `article-cleaner-extension` folder.
6. Open any tech blog (e.g., Medium, Baeldung, GeeksforGeeks) and click **Clean & Extract Article** from the extension popup!

---

