# AgentJ07

AgentJ07 is a set of Java tools I’ve put together over time to make building Minecraft plugins (for Bukkit, Paper, Velocity, etc.), Discord bots, and general Java projects way easier. Instead of reinventing the wheel for every project, I just pull in what I need from here—and now you can too. The library is always growing as I find new things to automate or clean up.

## Features for Minecraft Plugin Developers

- **Multi-version support:** Write plugins that work across different versions of Bukkit, Paper, and Velocity servers.
- **Abstracted APIs:** One codebase, multiple platforms—no more copy-pasting for every Minecraft update.
- **Simple plugin lifecycle:** Consistent load, enable, and disable hooks.
- **Less boilerplate:** Tons of helpers so you can jump right to the fun stuff.
- **Ready-made examples:** Check out the included templates to get started fast.

## Discord Bot Helpers

- **Reusable command/event code:** Cut down on repetitive bot logic.
- **Easy integration:** Bridge Discord bots with your Minecraft plugins, or run them standalone if you want.
- **Shared structure:** The same style and logging works everywhere.

## Java Utilities

- **Logging made simple:** One logger to rule them all, works in every module.
- **Everyday helpers:** Stuff like collections, file handling, and config utilities—grab what you need.

## Why does this exist?

Because I was tired of writing the same code over and over for every new plugin, bot, or Java project. Now I just use AgentJ07 as my starting point, and it’s saved me a ton of time. Maybe it’ll do the same for you.

## Getting Started

1. **Clone the repo:**
   ```bash
   git clone https://github.com/TheVihara/AgentJ07.git
   ```
2. **Plug in what you need:**  
   Browse the folders, pick the tools you want, and drop them into your own project.

3. **Check out the examples:**  
   There are working sample plugins and bot bits to show you how everything fits together.

## Roadmap

- [ ] Java utility basics and logging
- [ ] Bukkit plugin helpers and examples
- [ ] Discord bot scaffolding
- [ ] Abstract Minecraft API  
  _Currently working on a way for plugins to run on any supported Minecraft platform or version with minimal changes._
- [ ] More Minecraft versions  
  _Easy support for new MC server versions as they come out._
- [ ] Unified lifecycle for all project types  
  _Consistent load/enable/disable for plugins, bots, and utilities._
- [ ] Expand Discord bot features  
  _More helpers for events, commands, etc._
- [ ] More Java utilities  
  _Keep adding handy general-purpose code._
- [ ] More examples and templates  
  _Quick-start projects for both Minecraft and Discord._
- [ ] Better docs  
  _Guides, code comments, and how-tos._
- [ ] CI & releases  
  _Automated tests and deploys to Maven Central and GitHub Packages._

## Contributing

If you spot something to improve or want to add a feature, just open an issue or pull request. All feedback is welcome!

## License

MIT License—see [LICENSE](LICENSE) for the boring details.