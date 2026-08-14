# QRium

QRium is an Android application for scanning and creating QR codes and barcodes.

[![License](https://img.shields.io/github/license/rich1001204/QRium)](https://github.com/rich1001204/QRium/blob/main/LICENSE.txt)
[![Build APK](https://github.com/rich1001204/QRium/actions/workflows/build-apk.yml/badge.svg)](https://github.com/rich1001204/QRium/actions/workflows/build-apk.yml)
[![Latest release](https://img.shields.io/github/v/release/rich1001204/QRium)](https://github.com/rich1001204/QRium/releases)

![QRium icon](app/src/main/res/mipmap-xxxhdpi/ic_code_scanner.png)

## Features

QRium provides the following core features:

- Scan QR codes and barcodes with the device camera.
- Scan codes from images.
- Create QR codes with configurable content and colours.
- Save and review scan history.
- Open URL results automatically through the existing `URLAction` flow.
- Choose between System Default, Material 3, AMOLED, and Cyber appearance themes.
- Share generated codes and scan results.

The application package is `org.qrium.yrq`, and the displayed application name is `QRium`.

## Download

Download the latest Android APK from the [GitHub Releases](https://github.com/rich1001204/QRium/releases) page. GitHub Actions also publishes the Debug APKs as the `QRium-debug` artifact for successful builds.

The project currently builds three Debug variants:

```text
app-foss-debug.apk
app-general-debug.apk
app-play-debug.apk
```

## Build locally

Open the project in Android Studio, or run the Gradle wrapper from the repository root:

```bash
chmod +x ./gradlew
./gradlew assembleDebug
```

The APK files are written below:

```text
app/build/outputs/apk/foss/debug/app-foss-debug.apk
app/build/outputs/apk/general/debug/app-general-debug.apk
app/build/outputs/apk/play/debug/app-play-debug.apk
```

The repository contains a GitHub Actions workflow at `.github/workflows/build-apk.yml`. It builds Debug APKs on Ubuntu with Java 17 and uploads them as the `QRium-debug` artifact.

## Theme options

QRium stores the selected appearance in the existing application preferences. The available options are:

| Theme          | Behaviour                                                              |
| -------------- | ---------------------------------------------------------------------- |
| System Default | Follows the device light or dark mode.                                 |
| Material 3     | Uses the existing Material 3 design system and palette.                |
| AMOLED         | Uses a true black `#000000` background for dark surfaces.              |
| Cyber          | Uses a dark blue-black surface with cyan, magenta, and purple accents. |

## Development

The Android namespace and application ID are both `org.qrium.yrq`. The project uses the existing Gradle and Android configuration in this repository; no additional setup is required beyond a compatible Android Studio installation or Android SDK environment.

## AI-generated code disclosure

Parts of QRium's source code and documentation were generated or refined with assistance from three AI systems: **GPT**, **Qwen**, and **Manus**. Their assistance covered code generation, package migration, debugging, documentation, UI/theme implementation, and build workflow preparation. Human review and repository-level validation remain necessary before production distribution.

## Attribution and license

QRium is based on the upstream [Code Scanner project](https://github.com/czlucius/code-scanner). Original copyright notices, license text, and required attribution remain in the source tree. Please review [LICENSE.txt](LICENSE.txt) before using or redistributing this software.

QRium is distributed under the [GNU Affero General Public License version 3 or later](LICENSE.txt).

The application also uses open-source libraries including ZXing, Material Components, AndroidX, Moshi, Room, CameraX, ACRA, Material Intro, ez-vCard, LeakCanary, and AndroidPhotoshopColorPicker. Their respective licenses and notices remain applicable.

## Contributing

Issues and pull requests are welcome in the [QRium repository](https://github.com/rich1001204/QRium). Please keep changes focused, preserve the upstream license and attribution, and verify the relevant Debug build before submitting a pull request.
